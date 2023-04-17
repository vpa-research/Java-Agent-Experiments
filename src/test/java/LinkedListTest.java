import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void addMethodTest() {
        System.out.println("--START OF THE TEST--\n\n\n");

        LinkedList<Object> list = new LinkedList<>();
        list.add(2);

        int size = list.size();

        Assert.assertEquals(1, size);
        Assert.assertEquals(2, list.get(0));

        System.out.println("\n\n\n--END OF THE TEST--");
    }

    @Test
    public void removeMethodTest() {
        System.out.println("--START OF THE TEST--\n\n\n");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);



        int size = list.size();
        Assert.assertEquals(3, size);

        Integer remove = list.remove(1);
        Assert.assertEquals(Integer.valueOf(3), remove);

        size = list.size();
        Assert.assertEquals(2, size);

        System.out.println("\n\n\n--END OF THE TEST--");
    }
}
