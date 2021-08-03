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
    public void testBackwardBrackets() { assertFalse(BalancedBrackets.hasBalancedBrackets("][")); }//should be false
    // is true
    @Test
    public void testLaunchBrackets() { assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}
    @Test
    public void testInsideString() { assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}
    @Test
    public void testBeforeString() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));}
    @Test
    public void testAfterString() { assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));}
    @Test
    public void testNoBrackets() { assertTrue(BalancedBrackets.hasBalancedBrackets(""));}
    @Test
    public void  testOneBracketString() { assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}
    @Test
    public void testOneBracket() { assertFalse(BalancedBrackets.hasBalancedBrackets("["));}
    @Test
    public void testInsideStringBackwards() {assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}
}


//"[LaunchCode", "Launch]Code[", "[",