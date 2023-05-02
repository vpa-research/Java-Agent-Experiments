import com.huawei.MyLists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MyLinkedListsTest {
    private static final List<Integer> SOME_LIST = MyLists.newLinkedList(1, 2, 3, 4);

    @Test
    public void getTest() {
        System.out.println("--START OF THE TEST--\n\n\n");
        Integer actual = SOME_LIST.get(0);
        Assert.assertEquals(Integer.valueOf(1),actual);
    }
}