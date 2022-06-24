import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SelfOperationTests {
    int numerator;
    int denominator;
    Rational number;
    String message;

    @Before
    public void setUp(){
        numerator = 1;
        denominator = 2;
        number = new Rational(numerator, denominator);
        message = "%s failed";
    }

    @Test
    public void testSelfSum(){
        Rational sum = number.plus(number);
        assertEquals(String.format(message, "Addition"), new Rational(2 * numerator, denominator), sum);
    }

    @Test
    public void testSelfEquality(){
        assertTrue(String.format(message, "Self-equality"), number.equals(number));
    }

    @Test
    public void testSelfDivision() {
        Rational quotient = number.divide(number);
        assertEquals(String.format(message, "Division"), new Rational(1, 1), quotient);
    }
}
