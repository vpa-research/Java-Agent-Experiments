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
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {

        if("java/util/ArrayList".equals(superName))
            superName = "org/huawei/GeneratedArrayList";

        if("java/util/LinkedList".equals(superName))
            superName="org/huawei/GeneratedLinkedList";

        super.visit(version, access, name, signature, superName, interfaces);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        System.out.println("Name of the current method: " + name+" \nDescriptor of the current method: " + descriptor+" "+ signature);

        if(descriptor.contains("java/util/LinkedList")){
//            descriptor = "()Lorg/huawei/GeneratedLinkedList;";
//            signature = "<E:Ljava/lang/Object;>()Lorg/huawei/GeneratedLinkedList<TE;>;";
            descriptor = descriptor.replaceAll("java/util/LinkedList","org/huawei/GeneratedLinkedList");
            if(signature!=null)
                signature = signature.replaceAll("java/util/LinkedList","org/huawei/GeneratedLinkedList");
        }

        if(descriptor.contains("java/util/ArrayList")){
            descriptor = descriptor.replaceAll("java/util/ArrayList","org/huawei/GeneratedArrayList");
            if(signature!=null)
                signature = signature.replaceAll("java/util/ArrayList","org/huawei/GeneratedArrayList");
        }

        MethodVisitor defaultMethodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);
        return new MethodVisitorImpl(defaultMethodVisitor);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        //System.out.println("DESCRIPTOR OF THE FIELD: "+descriptor+" Name: " + name+" Signature: "+signature+" Value: " + value);
        if("Ljava/util/LinkedList;".equals(descriptor)) {
            descriptor = "Lorg/huawei/GeneratedLinkedList;";
            if(signature!=null)
                signature = signature.replaceAll("java/util/LinkedList","org/huawei/GeneratedLinkedList");
        }

        if("Ljava/util/ArrayList;".equals(descriptor)) {
            descriptor = "Lorg/huawei/GeneratedArrayList;";
            if(signature!=null)
                signature = signature.replaceAll("java/util/ArrayList","org/huawei/GeneratedArrayList");
        }

        return super.visitField(access, name, descriptor, signature, value);
    }

}
