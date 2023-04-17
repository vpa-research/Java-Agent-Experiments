import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListFieldListInClassTest {

    LinkedList<Integer> list = new LinkedList<>();

    @Test
    public void addTest() {
        System.out.println("--START OF THE TEST LinkedListFieldListInClassTest--\n\n\n");
        list.add(1);
        list.add(2);
        Assert.assertEquals(2,list.size());
        Assert.assertEquals(Integer.valueOf(1),list.get(0));
        Assert.assertEquals(Integer.valueOf(2),list.get(1));
        System.out.println("\n\n\n--END OF THE TEST LinkedListFieldListInClassTest--");
    }
}
