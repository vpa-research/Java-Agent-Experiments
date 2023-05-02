package com.huawei;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Collections;
import java.util.LinkedList;

public final class MyLists {

    public static <E extends @Nullable Object> LinkedList<E> newLinkedList(E... elements) {
        //This capacity is needed only for test!!! Because in this place was LinkageError!!!
        int capacity = computeArrayListCapacity(elements.length);
        LinkedList<E> list = new LinkedList<E>();
        Collections.addAll(list, elements);
        return list;
    }

    static int computeArrayListCapacity(int arraySize) {
        return MyInts.saturatedCast(5L + arraySize + (arraySize / 10));
    }

}
