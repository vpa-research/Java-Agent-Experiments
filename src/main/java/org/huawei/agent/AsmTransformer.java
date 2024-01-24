package org.huawei.agent;

import org.huawei.agent.util.ClassNamesReaderUtil;
import org.huawei.agent.util.OriginalClassesReplacerReader;
import org.huawei.agent.visitors.ClassVisitorImpl;
import org.huawei.agent.writers.ClassWriterImpl;
import org.objectweb.asm.ClassReader;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.Map;
import java.util.Set;

public class AsmTransformer implements ClassFileTransformer {

    private Set<String> classesForReplacing;
    private Map<String, String> classesMatcher;

    public AsmTransformer() {
        System.out.println("Was created ASM transformer");
        //TODO
        classesForReplacing = ClassNamesReaderUtil.getClassNames();
        classesMatcher = new OriginalClassesReplacerReader().readClassesFile();
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        if(classesForReplacing.contains(className) || className.startsWith("com/google/common") || className.startsWith("org/apache/commons") || className.startsWith("org/huawei/")){
            ClassReader cr = new ClassReader(classfileBuffer);
            ClassWriterImpl cw = new ClassWriterImpl(cr, ClassWriterImpl.COMPUTE_FRAMES);
            ClassVisitorImpl classVisitor = new ClassVisitorImpl(cw, classesMatcher);
            cr.accept(classVisitor, 0);
            return cw.toByteArray();
        }

        return ClassFileTransformer.super.transform(loader, className, classBeingRedefined, protectionDomain, classfileBuffer);
    }
}
