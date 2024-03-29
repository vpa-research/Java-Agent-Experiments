package org.huawei.agent.util;

import java.util.HashSet;
import java.util.Set;

public class ClassNamesReaderUtil {
    public static Set<String> getClassNames() {
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
        classesSet.add("ArrayListGuavaTest");
        classesSet.add("ArrayListGuavaTest$1");
        classesSet.add("com/huawei/MyLists");
        classesSet.add("com/huawei/MyInts");
        classesSet.add("com/huawei/MyConverter");
        classesSet.add("com/huawei/MyConverter$ReverseMyConverter");
        classesSet.add("IterablesTest");
        classesSet.add("IterablesTest$DiesOnIteratorArrayList");
        classesSet.add("SetsTestMethodTestNewCOWASFromIterableTest");
        classesSet.add("OptionalDoubleTest");
        classesSet.add("NewArrayListTest");
        classesSet.add("org/huawei/linkedlisttests/RegressionTest");
        classesSet.add("org/huawei/arraylisttests/RegressionTest");
        classesSet.add("org/huawei/hashsettests/RegressionTest");
        classesSet.add("org/huawei/linkedlist/RegressionTest");
        classesSet.add("org/huawei/arraylist/RegressionTest");
        return classesSet;
    }
}
