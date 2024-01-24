import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NewArrayListTest {

    @Test
    public void getTest() {
        System.out.println("Test was started...");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Integer expected = 1;
        Integer actual = list.get(0);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getSublistTest() {
        System.out.println("Test subList was started...");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> subList = list.subList(3, 6);
        subList.add(1);
        Assert.assertEquals(Integer.valueOf(1), subList.get(3));
//        System.out.println(subList.get(0));
//        Integer expected = 1;
//        Integer actual = list.get(0);
//        Assert.assertEquals(expected, actual);
    }
}
