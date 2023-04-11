import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void linkedListAddTest() {
        System.out.println("--START OF THE TEST--");

        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        //System.out.println(list.get(0));

        int size = list.size();
        System.out.println("Size: " + size);

        System.out.println("--END OF THE TEST--");
    }
}
