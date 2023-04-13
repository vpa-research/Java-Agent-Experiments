package org.huawei.agent;

import java.io.IOException;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.util.jar.JarFile;
//Tutorial:
//https://github.com/turn/RedefineClassAgent

public class RedefineClassAgent {

    private static volatile Instrumentation instrumentation = null;

    private static final String LINKED_LIST = "java.util.LinkedList";

    /**
     * Agent entry point. Do not call this directly.
     * <p>
     * This method is called by the JVM when this class is loaded as an agent.
     * <p>
     * Sets {@link #instrumentation} to {@code inst}, provided {@code inst} supports class redefinition.
     *
     * @param agentArgs
     * @param inst      This is the reason this class exists. {@link Instrumentation} has the
     *                  {@link Instrumentation#redefineClasses(ClassDefinition...)} method.
     */
    public static void premain(String agentArgs, Instrumentation inst) throws IOException {

        System.out.println("Agent was loaded...");
//
//        if (!inst.isRedefineClassesSupported()) {
//            System.out.println("Class redefinition not supported. Aborting.");
//            return;
//        }
//
//        if (agentArgs.isEmpty() || agentArgs == null) {
//            System.out.println("You must add path to jar file with GeneratedLinkedList");
//            return;
//        }
//
//        // Add my generated implementation of the LinkedList to boostrap classLoader;
//        // Name of this implementation is: "org.huawei.GeneratedLinkedList"
        JarFile jar = new JarFile(agentArgs);
        inst.appendToBootstrapClassLoaderSearch(jar);
//
//        // find a reference to the class and method you wish to inject
//        ClassPool classPool = ClassPool.getDefault();
//        classPool.insertClassPath(agentArgs);
//
//        CtClass ctClass = classPool.get(LINKED_LIST);
//        // TODO
//        // I don't know what this method does... ?
//        ctClass.stopPruning(true);
//
//        // javaassist freezes methods if their bytecode is saved
//        // defrost so we can still make changes.
//        if (ctClass.isFrozen()) {
//            ctClass.defrost();
//        }
//
//        // Changes in "size" method:
//        CtMethod method = ctClass.getDeclaredMethod("size"); // populate this from ctClass however you wish
//        method.insertBefore("System.out.println(\"This line is printing before size method...\" + Thread.currentThread().getStackTrace()[2].getClassName());");
//
//        // Changes in "add" method:
//        CtMethod methodAdd = ctClass.getDeclaredMethod("add", new CtClass[]{classPool.get("java.lang.Object")});
//        methodAdd.setBody("{ linkLast($1); " +
//                "org.huawei.GeneratedLinkedList gen = new org.huawei.GeneratedLinkedList(this); " +
//                "return gen.add($1);}");
//
//        instrumentation = inst;
//
//        // Changes in the "java.util.LinkedList" class;
//        byte[] bytecode = ctClass.toBytecode();
//        ClassDefinition definition = new ClassDefinition(Class.forName(LINKED_LIST), bytecode);
//        RedefineClassAgent.redefineClasses(definition);
        instrumentation = inst;
        //instrumentation.addTransformer(new JavaAssistTransformer(agentArgs));
        instrumentation.addTransformer(new AsmTransformer(agentArgs));
    }


}
