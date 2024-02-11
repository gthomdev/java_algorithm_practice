import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import factorial.Factorial;

public class FactorialTest {
    @Test
    public void factorialShouldReturnCorrectFactorial() {
        int input = 10;
        int expectedResult = 3628800;
        assertEquals(expectedResult, Factorial.factorial(input));
    }
}