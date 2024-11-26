// MainTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello, CI/CD!", Main.getMessage());
    }
}
