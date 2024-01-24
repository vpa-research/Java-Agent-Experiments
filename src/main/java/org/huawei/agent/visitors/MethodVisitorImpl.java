package org.huawei.agent.visitors;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Map;

public class MethodVisitorImpl extends MethodVisitor {

    private Map<String, String> classesMatcher;

    public MethodVisitorImpl(MethodVisitor methodVisitor, Map<String, String> classesMatcher) {
        super(Opcodes.ASM9, methodVisitor);
        this.classesMatcher = classesMatcher;
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
        if (classesMatcher.containsKey(owner))
            owner = classesMatcher.get(owner);

        for (Map.Entry<String, String> entry : classesMatcher.entrySet()) {
            if (descriptor.contains(entry.getKey())) {
                descriptor = descriptor.replaceAll(entry.getKey(), entry.getValue());
                break;
            }
        }

        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
    }

    //Instruction "NEW"
    @Override
    public void visitTypeInsn(int opcode, String type) {

        if (classesMatcher.containsKey(type))
            type = classesMatcher.get(type);

        super.visitTypeInsn(opcode, type);
    }

    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {

        for (Map.Entry<String, String> entry : classesMatcher.entrySet()) {
            if (descriptor.contains(entry.getKey())) {
                descriptor = descriptor.replaceAll(entry.getKey(), entry.getValue());
            }
        }

        super.visitFieldInsn(opcode, owner, name, descriptor);
    }

}
