import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ListsTest{

    private static final List<Integer> SOME_LIST = Lists.newArrayList(1, 2, 3, 4);

    @Test
    public void getTest() {
        Integer actual = SOME_LIST.get(0);
        Assert.assertEquals(Integer.valueOf(1),actual);
    }
}
