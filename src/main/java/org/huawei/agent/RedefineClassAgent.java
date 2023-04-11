package org.huawei.agent;

import javassist.*;

import java.io.IOException;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.jar.JarFile;

//Tutorial:
//https://github.com/turn/RedefineClassAgent

public class RedefineClassAgent {

    private static volatile Instrumentation instrumentation = null;

    /**
     * Agent entry point. Do not call this directly.
     * <p>
     * This method is called by the JVM when this class is loaded as an agent.
     * <p>
     * Sets {@link #instrumentation} to {@code inst}, provided {@code inst} supports class redefinition.
     *
     * @param agentArgs
     * @param inst This is the reason this class exists. {@link Instrumentation} has the
     *             {@link Instrumentation#redefineClasses(ClassDefinition...)} method.
     */
    public static void premain(String agentArgs, Instrumentation inst) throws NotFoundException, CannotCompileException, IOException, ClassNotFoundException, UnmodifiableClassException {
        System.out.println("Agent was loaded...");

        JarFile jar = new JarFile(agentArgs);
        inst.appendToBootstrapClassLoaderSearch(jar);

        if (!inst.isRedefineClassesSupported()) {
            System.out.println("Class redefinition not supported. Aborting.");
            return;
        }
        // find a reference to the class and method you wish to inject
        ClassPool classPool = ClassPool.getDefault();
        classPool.insertClassPath(agentArgs);
        //classPool.importPackage("org.huawei.GeneratedArrayList");
        CtClass experiment = classPool.get("org.huawei.GeneratedLinkedList");
        //System.out.println(experiment.getDeclaredMethods().length);
        CtClass ctClass = classPool.get("java.util.LinkedList");
        ctClass.stopPruning(true);

        // javaassist freezes methods if their bytecode is saved
        // defrost so we can still make changes.
        if (ctClass.isFrozen()) {
            ctClass.defrost();
        }

        //CtMethod method = ctClass.getDeclaredMethod("add", new CtClass[]{classPool.get("java.lang.Object")}); // populate this from ctClass however you wish
        CtMethod method = ctClass.getDeclaredMethod("size"); // populate this from ctClass however you wish

        method.insertBefore("System.out.println(\"Wheeeeee11! \" + Thread.currentThread().getStackTrace()[2].getClassName());");
        CtMethod methodAdd = ctClass.getDeclaredMethod("add",new CtClass[]{classPool.get("java.lang.Object")});
        //methodAdd.setBody("{Class.forName(org.huawei.agent.GeneratedArrayList); GeneratedArrayList gen = new GeneratedArrayList(this); " + "return gen.add(1);}");
        //methodAdd.addLocalVariable("gen", classPool.get("org.huawei.agent.GeneratedArrayList"));
        method.setBody("{org.huawei.GeneratedLinkedList gen = new org.huawei.GeneratedLinkedList(); return gen.add(java.lang.Integer.valueOf(1));}");
        //method.setBody("{ linkLast($1); org.huawei.GeneratedLinkedList gen = new org.huawei.GeneratedLinkedList(this); return gen.add($1);}");
        //ctClass.addField(new CtField(classPool.get("java.lang.Integer"),"any"));
        //CtField f1 = CtField.make("int testVar1 = 0;", ctClass);
        //f1.setModifiers(9);
        //ctClass.addField(f1);
        //ctClass.getClassPool().importPackage("org.huawei.agent.GeneratedArrayList");

        byte[] bytecode = ctClass.toBytecode();
        instrumentation = inst;
        ClassDefinition definition = new ClassDefinition(Class.forName("java.util.LinkedList"), bytecode);
        RedefineClassAgent.redefineClasses(definition);
    }

    /**
     * Attempts to redefine class bytecode.
     * @see Instrumentation#redefineClasses(ClassDefinition...)
     *
     * @param definitions classes to redefine.
     * @throws UnmodifiableClassException as thrown by {@link Instrumentation#redefineClasses(ClassDefinition...)}
     * @throws ClassNotFoundException as thrown by {@link Instrumentation#redefineClasses(ClassDefinition...)}
     */
    public static void redefineClasses(ClassDefinition... definitions)
            throws UnmodifiableClassException, ClassNotFoundException{
        instrumentation.redefineClasses(definitions);
    }
}
