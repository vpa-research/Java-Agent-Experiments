import com.google.common.collect.Lists;
import junit.framework.AssertionFailedError;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.Arrays.asList;

public class ArrayListGuavaTest {
//    private static final List<Integer> SOME_LIST = Lists.newArrayList(1, 2, 3, 4);

    @Test
    public void testCopyInto_NonCollection() {
        final ArrayList<Integer> iterList = Lists.newArrayList(9, 8, 7);
        Iterable<Integer> iterable =
                new Iterable<Integer>() {
                    @Override
                    public Iterator<Integer> iterator() {
                        return iterList.iterator();
                    }
                };
    }
}
