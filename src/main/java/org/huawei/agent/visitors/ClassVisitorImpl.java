package org.huawei.agent.visitors;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Map;

public class ClassVisitorImpl extends ClassVisitor {

    private Map<String, String> classesMatcher;

    public ClassVisitorImpl(ClassVisitor classVisitor, Map<String, String> classesMatcher) {
        super(Opcodes.ASM9, classVisitor);
        this.classesMatcher = classesMatcher;
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {

        if(classesMatcher.containsKey(superName))
            superName = classesMatcher.get(superName);

        super.visit(version, access, name, signature, superName, interfaces);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        System.out.println("Name of the current method: " + name+" \nDescriptor of the current method: " + descriptor+" "+ signature);

        for (Map.Entry<String, String> entry : classesMatcher.entrySet()) {
            if(descriptor.contains(entry.getKey())){
                descriptor = descriptor.replaceAll(entry.getKey(), entry.getValue());
                if(signature != null)
                    signature = signature.replaceAll(entry.getKey(), entry.getValue());
                break;
            }
        }

        MethodVisitor defaultMethodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);
        return new MethodVisitorImpl(defaultMethodVisitor, classesMatcher);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        //System.out.println("DESCRIPTOR OF THE FIELD: "+descriptor+" Name: " + name+" Signature: "+signature+" Value: " + value);

        for (Map.Entry<String, String> entry : classesMatcher.entrySet()) {
            if(descriptor.contains(entry.getKey())){
                descriptor = descriptor.replaceAll(entry.getKey(), entry.getValue());
                if(signature != null)
                    signature = signature.replaceAll(entry.getKey(), entry.getValue());
            }
        }

        return super.visitField(access, name, descriptor, signature, value);
    }

}
