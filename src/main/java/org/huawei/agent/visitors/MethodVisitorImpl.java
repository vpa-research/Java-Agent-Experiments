package org.huawei.agent.visitors;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MethodVisitorImpl extends MethodVisitor  {

    public MethodVisitorImpl(MethodVisitor methodVisitor) {
        super(Opcodes.ASM9, methodVisitor);
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
        //System.out.println("Name of the method: " + name+" Descriptor of the method: "+ descriptor+" OWNER: " + owner+" " + opcode);
        if("java/util/LinkedList".equals(owner)){
            owner = "org/huawei/GeneratedLinkedList";
        }
        if(descriptor.contains("Ljava/util/LinkedList")){
            descriptor = descriptor.replaceAll("Ljava/util/LinkedList", "Lorg/huawei/GeneratedLinkedList");
            System.out.println("NEW DESCRIPTOR: "+ descriptor);
        }
        //System.out.println("Name of the method: " + name+" Descriptor of the method: "+ descriptor+" OWNER: " + owner);
        super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
    }

    //Instruction "NEW"
    @Override
    public void visitTypeInsn(int opcode, String type) {
        System.out.println("TYPE: "+type);
        if("java/util/LinkedList".equals(type)){
            type = "org/huawei/GeneratedLinkedList";
        }
        super.visitTypeInsn(opcode, type);
    }

    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
        System.out.println("FILED OWNER: " + owner+" "+descriptor);
        if("Ljava/util/LinkedList;".equals(descriptor))
            descriptor = "Lorg/huawei/GeneratedLinkedList;";
        super.visitFieldInsn(opcode, owner, name, descriptor);
    }

}
