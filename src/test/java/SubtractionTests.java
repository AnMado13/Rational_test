import org.junit.*;
import static org.junit.Assert.*;

public class SubtractionTests {

    //1
    @Test
    public void testZeroMinusZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0, 1);
        Rational sub = number1.minus(number2);
        assertEquals("Subtraction returns wrong numerator", 0, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 1, sub.getDenominator());

    }

    //2
    @Test
    public void testZeroMinusNotZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(3, 8);
        Rational sub = number1.minus(number2);
        assertEquals("Subtraction returns wrong numerator", -3, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 8, sub.getDenominator());
    }

    //3
    @Test
    public void testNotZeroMinusZero(){
        Rational number1 = new Rational(5, 11);
        Rational number2 = new Rational(0, 1);
        Rational sub = number1.minus(number2);
        assertEquals("Subtraction returns wrong numerator", 5, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 11, sub.getDenominator());
    }

    //4
    @Test
    public void testPositiveMinusPositive(){
        Rational number1 = new Rational(3, 2);
        Rational number2 = new Rational(4, 3);
        Rational sub = number1.minus(number2);
        assertEquals("Subtraction returns wrong numerator", 1, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 6, sub.getDenominator());
    }

    //5
    @Test
    public void testPositiveMinusNegative(){
        Rational number1 = new Rational(2, 3);
        Rational number2 = new Rational(-1, 4);
        Rational sub = number1.minus(number2);
        assertEquals("Subtraction returns wrong numerator", 11, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 12, sub.getDenominator());
    }

    //6
    @Test
    public void testNegativeMinusPositive(){
        Rational number1 = new Rational(-1, 4);
        Rational number2 = new Rational(2, 3);
        Rational sub = number1.minus(number2);
        assertEquals("Subtraction returns wrong numerator", -11, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 12, sub.getDenominator());
    }

    //7
    @Test
    public void testNegativeMinusNegative(){
        Rational number1 = new Rational(-2, 3);
        Rational number2 = new Rational(-3, 3);
        Rational sub = number1.minus(number2);
        assertEquals("Subtraction returns wrong numerator", 1, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 3, sub.getDenominator());
    }

    //8
    @Test
    public void testSelfSubtraction(){
        Rational number = new Rational(1, 2);
        Rational sub = number.minus(number);
        assertEquals("Subtraction returns wrong numerator", 0, sub.getNumerator());
        assertEquals("Subtraction returns wrong denominator", 1, sub.getDenominator());
    }
}
