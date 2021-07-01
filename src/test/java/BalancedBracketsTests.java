import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBracketsTests {

    @Test
    public void starterTest() {
        assertEquals(10, 10, .001);
    }

    @Test
    public void testBasicBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
}
