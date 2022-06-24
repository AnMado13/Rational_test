import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ConstructorSimpleTests {

    //Numerator and denominator should have no common divisors. Reduction isn't tested there.
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
                {0, 1, "zero numerator"},
                {1, 2, "positive numerator and denominator"},
                {-1, -3, "negative numerator and denominator"},
                {-2, 5, "negative numerator and positive denominator"},
                {4, -7, "positive numerator and negative denominator"}
        });
    }

    int numerator;
    int denominator;
    Rational number;
    String message;

    public ConstructorSimpleTests(int numerator,
                                  int denominator,
                                  String fragmentMessage
    ){
        this.message = String.format("Constructor for number with %s returns wrong", fragmentMessage);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Test
    public void testSimpleConstructor(){
        number = new Rational(numerator, denominator);
        if (denominator < 0) {
            denominator *= -1;
            numerator *= -1;
        }
        assertEquals(message + " numetaror", numerator, number.getNumerator());
        assertEquals(message + " denominator", denominator, number.getDenominator());
    }
}