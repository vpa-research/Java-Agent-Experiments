package org.huawei.agent;

import org.huawei.agent.util.ClassNamesReaderUtil;
import org.huawei.agent.visitors.ClassVisitorImpl;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.Set;

public class AsmTransformer implements ClassFileTransformer {

    private static String AGENT_ARGS;
    private Set<String> classesForReplacing;

    public AsmTransformer(String agentArgs) {
        System.out.println("Was created ASM transformer");
        AGENT_ARGS = agentArgs;
        //TODO
        classesForReplacing = ClassNamesReaderUtil.getClassNames("");
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {

        //if("LinkedListTest".equals(className) || "LinkedListFieldListInClassTest".equals(className)) {
        if(classesForReplacing.contains(className) || className.startsWith("com/google/common") || className.startsWith("org/apache/commons")){
            ClassReader cr = new ClassReader(classfileBuffer);
            ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_FRAMES);
            ClassVisitorImpl classVisitor = new ClassVisitorImpl(cw);
            cr.accept(classVisitor, 0);
            return cw.toByteArray();
        }

        return ClassFileTransformer.super.transform(loader, className, classBeingRedefined, protectionDomain, classfileBuffer);
    }
}
