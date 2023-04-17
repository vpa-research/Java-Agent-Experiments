package org.huawei.agent.visitors;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MethodVisitorImpl extends MethodVisitor  {

    public MethodVisitorImpl(MethodVisitor methodVisitor) {
        super(Opcodes.ASM9, methodVisitor);
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
        System.out.println("Name of the method: " + name+" Descriptor of the method: "+ descriptor+" OWNER: " + owner);
        if("java/util/LinkedList".equals(owner)){
            owner = "org/huawei/GenLinkedList";
        }
        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
    }

    @Override
    public void visitTypeInsn(int opcode, String type) {
        System.out.println("TYPE: "+type);
        if("java/util/LinkedList".equals(type)){
            type = "org/huawei/GenLinkedList";
        }
        super.visitTypeInsn(opcode, type);
    }

}
