package org.huawei.agent;

import javassist.*;

import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class Transformer implements ClassFileTransformer {

    private static final String LINKED_LIST = "java.util.LinkedList";
    private static String AGENT_ARGS;

    public Transformer(String agentArgs) {
        AGENT_ARGS = agentArgs;
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println(className);
        if ("java/util/LinkedList".equals(className)) {

            ClassPool classPool = ClassPool.getDefault();

            try {
                CtClass ctClass = classPool.get(LINKED_LIST);
                classPool.insertClassPath(AGENT_ARGS);

                ctClass.stopPruning(true);
                if (ctClass.isFrozen()) {
                    ctClass.defrost();
                }

                //CtField f1 = CtField.make("int testVar1 = 0;", ctClass);
                CtField f1 = CtField.make("org.huawei.GeneratedLinkedList gen = new org.huawei.GeneratedLinkedList(this);", ctClass);
                f1.setModifiers(1);
                ctClass.addField(f1);

                CtMethod methodAdd = ctClass.getDeclaredMethod("add", new CtClass[]{classPool.get("java.lang.Object")});
                methodAdd.setBody("{ return gen.add($1);}");

                CtMethod methodSize = ctClass.getDeclaredMethod("size");
                methodSize.setBody("{ return gen.size();}");

                CtMethod methodGet = ctClass.getDeclaredMethod("get", new CtClass[]{CtClass.intType});
                methodGet.setBody("{ return gen.get($1);}");

                byte[] bytecode = ctClass.toBytecode();
                return bytecode;
            } catch (NotFoundException | CannotCompileException | IOException e) {
                System.out.println("NOT FOUND CLASS");
                e.printStackTrace();
            }

            System.out.println(className);
        }
        return ClassFileTransformer.super.transform(loader, className, classBeingRedefined, protectionDomain, classfileBuffer);
    }
}
