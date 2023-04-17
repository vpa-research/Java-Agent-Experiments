import org.junit.Assert;
import org.junit.Test;

public class LinkedListInsideOtherClassTest {
    @Test
    public void sizeLinkedListContainer() {
        System.out.println("--------LinkedList inside container---------");
        ListContainer container = new ListContainer();
        int size = container.getListSize(-1, 2);
        Assert.assertEquals(1,size);
    }
}
