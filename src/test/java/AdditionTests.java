import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AdditionTests {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1, 0, 1, "zero plus zero"},
                {0, 1, 3, 8, "zero plus not zero"},
                {-5, 11, 0, 1, "not zero plus zero"},
                {3, 2, 4, 3, "positive plus positive"},
                {2, 3, -1, 4, "positive plus negative"},
                {-1, 4, 2, 3, "negative plus positive"},
                {-2, 3, -3, 3, "negative plus negative"}
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
    Rational sum;

    public AdditionTests(int firstNumerator,
                         int firstDenominator,
                         int secondNumerator,
                         int secondDenominator,
                         String fragmentMessage
    ){
        this.firstNumerator = firstNumerator;
        this.firstDenominator = firstDenominator;
        this.secondNumerator = secondNumerator;
        this.secondDenominator = secondDenominator;
        this.message = String.format("Addition %s failed", fragmentMessage);
        this.firstNumber = new Rational(firstNumerator, firstDenominator);
        this.secondNumber = new Rational(secondNumerator, secondDenominator);
    }

    @Test
    public void shouldReturnCorrectSum(){
        sum = firstNumber.plus(secondNumber);
        int expectedNumerator = firstNumerator * secondDenominator + secondNumerator * firstDenominator;
        int expectedDenominator =  firstDenominator * secondDenominator;
        assertEquals(message, new Rational(expectedNumerator, expectedDenominator), sum);

    }
}
