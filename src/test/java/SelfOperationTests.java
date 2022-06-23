import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        message = "%s is failed";
    }

    @Test
    public void testSelfSum(){
        Rational sum = number.plus(number);
        assertEquals(String.format(message, "Addition"), new Rational(2 * numerator, denominator), sum);
    }
}
