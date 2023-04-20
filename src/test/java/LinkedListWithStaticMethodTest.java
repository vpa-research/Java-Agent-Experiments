import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListWithStaticMethodTest {

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <E> LinkedList<E> newLinkedList2() {
        return newLinkedList();
    }

    @Test
    public void addTest() {
        System.out.println("---THIS TEST CONTAINS STATIC METHOD---");
        List<Integer> list = newLinkedList2();
        list.add(1);
        Assert.assertEquals(Integer.valueOf(1), list.get(0));
        Assert.assertEquals(1,list.size());
    }
}
