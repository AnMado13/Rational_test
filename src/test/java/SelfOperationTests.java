import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void testSelfSubtraction(){
        Rational difference = number.minus(number);
        assertEquals(String.format(message, "Subtraction"), new Rational(0, 1), difference);
    }

    @Test
    public void testStandardConstructor() {
        number = new Rational();
        message = "Standard constructor returns wrong %s";
        assertEquals(String.format(message,"numerator"), 0, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 1, number.getDenominator());
    }

    @Test
    public void testSelfEquality(){
        assertTrue(String.format(message, "Self-equality"), number.equals(number));
    }

    @Test
    public void testSelfStrictInequality(){
        assertFalse(String.format(message, "Strict inequality"), number.less(number));
    }

    @Test
    public void testSelfInequality(){
        assertTrue(String.format(message, "Inequality"), number.lessOrEqual(number));
    }

    @Test
    public void testSelfDivision() {
        Rational quotient = number.divide(number);
        assertEquals(String.format(message, "Division"), new Rational(1, 1), quotient);
    }

    @Test
    public void testSelfMultiplication(){
        Rational product = number.multiply(number);
        assertEquals(String.format(message, "Multiplication"), new Rational(numerator * numerator, denominator * denominator), product);
    }
}
