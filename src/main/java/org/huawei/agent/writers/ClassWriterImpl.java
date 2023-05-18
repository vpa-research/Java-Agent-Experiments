package org.huawei.agent.writers;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ClassWriterImpl extends ClassWriter {

    public ClassWriterImpl(int flags) {
        super(flags);
    }

    public ClassWriterImpl(ClassReader classReader, int flags) {
        super(classReader, flags);
    }

    //https://stackoverflow.com/questions/43154658/issue-with-asm-getmergedtype-and-getcommonsuperclass
    //https://stackoverflow.com/questions/69563714/linkageerror-attempted-duplicate-class-definition-when-dynamically-instrument
    @Override
    protected String getCommonSuperClass(String type1, String type2) {

        try {
            System.out.println("Classes: "+type1+"   "+ type2);
            List<String> aSuperClasses = new LinkedList<>();
            List<String> bSuperClasses = new LinkedList<>();
            ClassReader aClass = new ClassReader(type1);
            ClassReader bClass = new ClassReader(type2);
            String aSuper = aClass.getSuperName();
            String bSuper = bClass.getSuperName();
//            System.out.println("aClass: " + aClass.getClassName()+" bClass: " + bClass.getClassName() +
//                    " aSuper: " + aSuper + " bSuper:" + bSuper);
            //Because super class of the Object will be null !!!
            if("java/lang/Object".equals(aClass.getClassName()) || "java/lang/Object".equals(bClass.getClassName()))
                return "java/lang/Object";
            //1) aClass extends bClass
            if(aSuper.equals(bClass.getClassName()))
                return aSuper;
            //2) bClass extends aClass
            else if(bSuper.equals(aClass.getClassName()))
                return bSuper;
            //3)
            else if(!isInterface(aClass) && !isInterface(bClass)){
                do{
                    String className = aClass.getClassName();
                    if("java/lang/Object".equals(className))
                        break;
                    aSuperClasses.add(className);
                    aClass = new ClassReader(aClass.getSuperName());
                } while (true);

                do{
                    String className = bClass.getClassName();
                    if("java/lang/Object".equals(className))
                        break;
                    bSuperClasses.add(className);
                    bClass = new ClassReader(bClass.getSuperName());
                } while (true);
//                System.out.println(aSuperClasses);
//                System.out.println(bSuperClasses);
                for (String aSuperClass : aSuperClasses) {
                    for (String bSuperClass : bSuperClasses) {
                        if(aSuperClass.equals(bSuperClass))
                            return aSuperClass;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "java/lang/Object";
    }

    //https://stackoverflow.com/questions/40119773/is-there-a-way-to-tell-if-a-class-is-an-interface
    public boolean isInterface(ClassReader cr) {
        return ((cr.getAccess() & 0x200) != 0);
    }
}
