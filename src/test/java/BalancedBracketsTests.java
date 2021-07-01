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

    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[]]]"));
    }

    @Test
    public void imbalancedBrackets() {
        // this failing test indicates a logic bug in .hasBalancedBrackets it should have returned False, but returned True!
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}
