import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SettersAndGettersTests {

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {0, 1, "zero numerator and positive denominator"},
                {0, -1, "zero numerator and negative denominator"},
                {2, 3, "positive numerator and denominator"},
                {-2, -5, "negative numerator and denominator"},
                {-4, 7, "negative numerator and positive denominator"},
                {3, -8, "positive numerator and negative denominator"},
                {2, 4, "positive number, but with not reduced fraction"},
                {-3, 9, "negative number, but with not reduced fraction"}
        });
    }

    int numerator;
    int denominator;
    String message;
    String fragmentMessage;
    Rational number;

    public SettersAndGettersTests(int numerator,
                                  int denominator,
                                  String fragmentMessage)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        this.fragmentMessage = fragmentMessage;
    }

    @Before
    public void createNumber(){
        number = new Rational(numerator, denominator);
    }

    @Test
    public void testNumeratorSetter(){
        message = "Setter for Numerator failed for " + fragmentMessage;
        number.setNumerator(numerator);
        assertEquals(message, numerator, number.getNumerator());
    }

    @Test
    public void testDenominatorSetter(){
        message = "Setter for Denominator failed for " + fragmentMessage;
        number.setDenominator(denominator);
        assertEquals(message, denominator, number.getDenominator());
    }

    @Test
    public void testNumeratorGetter(){
        message = "Getter for Numerator failed for " + fragmentMessage;
        assertEquals(message, numerator, number.getNumerator());
    }

    @Test
    public void testDenominatorGetter(){
        message = "Getter for Denominator failed for " + fragmentMessage;
        assertEquals(message, denominator, number.getDenominator());
    }
}
