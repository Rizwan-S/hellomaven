import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Main obj = new Main();

    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for true positive", 120, obj.factorial(5));
        assertEquals("Finding factorial of a number for true positive", 24, obj.factorial(4));
    }
}
