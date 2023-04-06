import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest {

    @Test
    public void arrayListAddTest() {
        System.out.println("--START--");
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        //...
        LinkedList<Object> list2 = new LinkedList<>();
        list2.add(1);
        int size = list2.size();
        System.out.println("Size: " + size);
        System.out.println("--END--");
    }
}
