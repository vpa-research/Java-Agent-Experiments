import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

//This example is from Guava;
//In this case we will have such situation in "getCommonSuperClass" method:
//aClass = java/lang/Object
//bClass = java/util/Collection
//aSuper = null
//bSuper = java/lang/Object
//This leads to NPE;
//Handler of this case was added to "ClassWriterImpl" class (method: "getCommonSuperClass");
//This happens in class "Sets" in the method "removeAll";

public class SetsTestMethodTestNewCOWASFromIterableTest {

    private static final Collection<Integer> SOME_COLLECTION = Arrays.asList(0, 1, 1);

    private static final Iterable<Integer> SOME_ITERABLE =
            new Iterable<Integer>() {
                @Override
                public Iterator<Integer> iterator() {
                    return SOME_COLLECTION.iterator();
                }
            };

    @Test
    public void newCOWASFromIterableTest() {
        CopyOnWriteArraySet<Integer> set = Sets.newCopyOnWriteArraySet(SOME_ITERABLE);
    }

}
