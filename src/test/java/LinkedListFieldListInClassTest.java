import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListFieldListInClassTest {

    LinkedList<Integer> list = new LinkedList<>();
    List<Integer> list2 = new LinkedList<>();

    @Test
    public void addLinkedListTest() {
        System.out.println("--START OF THE TEST LinkedListFieldListInClassTest--\n\n\n");
        list.add(1);
        list.add(2);
        Assert.assertEquals(2,list.size());
        Assert.assertEquals(Integer.valueOf(1),list.get(0));
        Assert.assertEquals(Integer.valueOf(2),list.get(1));
        System.out.println("\n\n\n--END OF THE TEST LinkedListFieldListInClassTest--");
    }

    @Test
    public void addListTest() {
        System.out.println("--START OF THE TEST LinkedListFieldListInClassTest--\n\n\n");
        list2.add(1);
        list2.add(2);
        Assert.assertEquals(2,list2.size());
        Assert.assertEquals(Integer.valueOf(1),list2.get(0));
        Assert.assertEquals(Integer.valueOf(2),list2.get(1));
        System.out.println("\n\n\n--END OF THE TEST LinkedListFieldListInClassTest--");
    }
}
