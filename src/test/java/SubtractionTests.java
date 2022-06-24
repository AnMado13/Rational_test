import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SubtractionTests {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1, 0, 1, "zero minus zero"},
                {0, 1, 3, 8, "zero minus not zero"},
                {-5, 11, 0, 1, "not zero minus zero"},
                {3, 2, 4, 3, "positive minus positive"},
                {2, 3, -1, 4, "positive minus negative"},
                {-1, 4, 2, 3, "negative minus positive"},
                {-2, 3, -3, 3, "negative minus negative"}
        });
    }
    //Parameters
    int firstNumerator;
    int firstDenominator;
    int secondNumerator;
    int secondDenominator;
    String message;

    Rational firstNumber;
    Rational secondNumber;
    Rational difference;

    public SubtractionTests(int firstNumerator,
                            int firstDenominator,
                            int secondNumerator,
                            int secondDenominator,
                            String fragmentMessage
    ){
        this.firstNumerator = firstNumerator;
        this.firstDenominator = firstDenominator;
        this.secondNumerator = secondNumerator;
        this.secondDenominator = secondDenominator;
        this.message = String.format("Subtraction %s failed", fragmentMessage);
        this.firstNumber = new Rational(firstNumerator, firstDenominator);
        this.secondNumber = new Rational(secondNumerator, secondDenominator);
    }

    @Test
    public void shouldReturnCorrectDifference(){
        difference = firstNumber.minus(secondNumber);
        int expectedNumerator = firstNumerator * secondDenominator - secondNumerator * firstDenominator;
        int expectedDenominator =  firstDenominator * secondDenominator;
        assertEquals(message, new Rational(expectedNumerator, expectedDenominator), difference);

    }
}
