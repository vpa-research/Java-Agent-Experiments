import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class OptionalDoubleTest {

    @Test
    public void createEmptyOptionalDoubleTest() {
        OptionalDouble empty = OptionalDouble.empty();
        Assert.assertEquals(false, empty.isPresent());
    }
}
