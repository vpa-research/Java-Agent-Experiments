import org.junit.Test;

public class isAssignableFromTest {
    @Test
    public void testIsAssignableFrom() {
        System.out.println("isAssignableFromTest");
        C c = new C();
        System.out.println(C.class.getClass().isAssignableFrom(A.class.getClass()));
    }
}


class A{}

class B extends A {}

class C extends B {}

class D extends C {}