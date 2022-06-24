import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class DivisionTests {

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0, 1, 9, 5, "zero by positive"},
                {0, 1, -3, 4, "zero by negative"},
                {3, 4, 5, 4, "positive by positive"},
                {7, 10, -5, 6, "positive by negative"},
                {-3, 4, 2, 7, "negative by positive"},
                {-1, 4, -2, 4, "negative by negative"}

        });
    }

    int firstNumerator;
    int firstDenominator;
    int secondNumerator;
    int secondDenominator;
    String message;
    Rational divisible;
    Rational divisor;
    Rational quotient;

    public DivisionTests(int firstNumerator,
                         int firstDenominator,
                         int secondNumerator,
                         int secondDenominator,
                         String fragmentMessage
    ){
        this.firstNumerator = firstNumerator;
        this.firstDenominator = firstDenominator;
        this.secondNumerator = secondNumerator;
        this.secondDenominator = secondDenominator;
        this.divisible = new Rational(firstNumerator, firstDenominator);
        this.divisor = new Rational(secondNumerator, secondDenominator);
        this.message = String.format("Division %s failed", fragmentMessage);
    }

    @Test
    public void shouldReturnCorrectQuotient(){
        quotient = divisible.divide(divisor);
        int expectedNumerator = firstNumerator * secondDenominator;
        int expectedDenominator = firstDenominator * secondNumerator;
        assertEquals(message, new Rational(expectedNumerator, expectedDenominator), quotient);
    }
}
