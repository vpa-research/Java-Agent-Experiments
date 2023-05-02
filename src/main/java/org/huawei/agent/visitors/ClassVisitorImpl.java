package org.huawei.agent.visitors;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ClassVisitorImpl extends ClassVisitor {

    public ClassVisitorImpl(ClassVisitor classVisitor) {
        super(Opcodes.ASM9, classVisitor);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
//        System.out.println("Name of the current method: " + name+" \nDescriptor of the current method: " + descriptor+" "+ signature);

        if(descriptor.contains("java/util/LinkedList")){
//            descriptor = "()Lorg/huawei/GeneratedLinkedList;";
//            signature = "<E:Ljava/lang/Object;>()Lorg/huawei/GeneratedLinkedList<TE;>;";
            descriptor = descriptor.replaceAll("java/util/LinkedList","org/huawei/GeneratedLinkedList");
            signature = signature.replaceAll("java/util/LinkedList","org/huawei/GeneratedLinkedList");
        }
        MethodVisitor defaultMethodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);
        return new MethodVisitorImpl(defaultMethodVisitor);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        //System.out.println("DESCRIPTOR OF THE FIELD: "+descriptor+" Name: " + name+" Signature: "+signature+" Value: " + value);
        if("Ljava/util/LinkedList;".equals(descriptor)) {
            descriptor = "Lorg/huawei/GeneratedLinkedList;";
            signature = "Lorg/huawei/GeneratedLinkedList<Ljava/lang/Integer;>;";
        }
        return super.visitField(access, name, descriptor, signature, value);
    }

}
