import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {


    @Test
    public void testit() {
        Assertions.assertEquals(2, 2);
    }

    @Test
    public void test2() {
        Assertions.assertNotEquals(2,3);
    }
}
