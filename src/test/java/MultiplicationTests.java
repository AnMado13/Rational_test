import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MultiplicationTests {

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0, 1, 0, 1, "zero by zero"},
                {0, 1, 2, 3, "zero by not zero"},
                {-4, 5, 0, 1, "not zero by zero"},
                {5, 7, 1, 2, "positive by positive"},
                {1, 4, -3, 2, "positive by negative"},
                {-7, 3, 2, 5, "negative by positive"},
                {-1, 2, -3, 2, "negative by negative"}
        });
    }

    int firstNumerator;
    int firstDenominator;
    int secondNumerator;
    int secondDenominator;
    String message;
    Rational leftMultiplier;
    Rational rightMultiplier;
    Rational product;

    public MultiplicationTests(int firstNumerator,
                               int firstDenominator,
                               int secondNumerator,
                               int secondDenominator,
                               String fragmentMessage
    ){
        this.firstNumerator = firstNumerator;
        this.firstDenominator = firstDenominator;
        this.secondNumerator = secondNumerator;
        this.secondDenominator = secondDenominator;
        this.leftMultiplier = new Rational(firstNumerator, firstDenominator);
        this.rightMultiplier = new Rational(secondNumerator, secondDenominator);
        this.message = String.format("Multiplication %s failed", fragmentMessage);
    }

    @Test
    public void shouldReturnCorrectProduct(){
        product = leftMultiplier.multiply(rightMultiplier);
        int expectedNumerator = firstNumerator * secondNumerator;
        int expectedDenominator = firstDenominator * secondDenominator;
        assertEquals(message, new Rational(expectedNumerator, expectedDenominator), product);
    }

}
