import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void linkedListAddTest() {
        System.out.println("--START OF THE TEST--\n\n\n");

        LinkedList<Object> list = new LinkedList<>();
        list.add(2);

        int size = list.size();

        Assert.assertEquals(1, size);
        Assert.assertEquals(2, list.get(0));

        System.out.println("\n\n\n--END OF THE TEST--");
    }
}
