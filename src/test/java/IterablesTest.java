import com.google.common.collect.Iterables;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class IterablesTest {

    private static class DiesOnIteratorArrayList extends ArrayList<String> {
        /** @throws UnsupportedOperationException all the time */
        @Override
        public Iterator<String> iterator() {
            throw new UnsupportedOperationException();
        }
    }

    @Test
    public void anyTest(){
        List<String> diesOnIteratorList = new DiesOnIteratorArrayList();
        diesOnIteratorList.add("bar");

        assertEquals("bar", Iterables.getLast(diesOnIteratorList, "qux"));
    }

}
