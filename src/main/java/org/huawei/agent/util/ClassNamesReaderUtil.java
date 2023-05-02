package org.huawei.agent.util;

import java.util.HashSet;
import java.util.Set;

public class ClassNamesReaderUtil {
    public static Set<String> getClassNames(String pathToClasses){
        //TODO
        Set<String> classesSet = new HashSet<>();
        classesSet.add("LinkedListFieldListInClassTest");
        classesSet.add("LinkedListInsideOtherClassTest");
        classesSet.add("LinkedListTest");
        classesSet.add("ListContainer");
        classesSet.add("LinkedListWithStaticMethodTest");
        classesSet.add("CommonsMathTest");
        classesSet.add("ListsTest");
        classesSet.add("MyLinkedListsTest");
        classesSet.add("com/huawei/MyLists");
        classesSet.add("com/huawei/MyInts");
        classesSet.add("com/huawei/MyConverter");
        classesSet.add("com/huawei/MyConverter$ReverseMyConverter");
        return classesSet;
    }
}
