package org.huawei.agent.writers;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.io.IOException;

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
            ClassReader aClass = new ClassReader(type1);
            ClassReader bClass = new ClassReader(type2);
            String aSuper = aClass.getSuperName();
            String bSuper = bClass.getSuperName();
            if(aSuper.equals(bClass.getClassName()))
                return aSuper;
            else if(bSuper.equals(aClass.getClassName()))
                return bSuper;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "java/lang/Object";
    }
}
