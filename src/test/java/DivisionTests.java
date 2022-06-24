import org.junit.*;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class DivisionTests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //1
    @Test
    public void testPositiveDivideZero(){
        Rational number1 = new Rational(1, 3);
        Rational number2 = new Rational(0, 1);
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        number1.divide(number2);
    }

    //2
    @Test
    public void testNegativeDivideZero(){
        Rational number1 = new Rational(-2, 5);
        Rational number2 = new Rational(0, 1);
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        number1.divide(number2);
    }

    //3
    @Test
    public void testZeroDivideZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0, 1);
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        number1.divide(number2);
    }

    //4
    @Test
    public void testPositiveDividePositive(){
        Rational number1 = new Rational(3, 4);
        Rational number2 = new Rational(5, 4);
        Rational number3 = number1.divide(number2);
        assertEquals("Division returns wrong numerator", 3, number3.getNumerator());
        assertEquals("Division returns wrong denominator", 5, number3.getDenominator());
    }

    //5
    @Test
    public void testZeroDividePositive(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(9, 5);
        Rational number3 = number1.divide(number2);
        assertEquals("Division returns wrong numerator", 0, number3.getNumerator());
        assertEquals("Division returns wrong denominator", 1, number3.getDenominator());
    }

    //6
    @Test
    public void testNegativeDividePositive(){
        Rational number1 = new Rational(-3, 4);
        Rational number2 = new Rational(2, 7);
        Rational number3 = number1.divide(number2);
        assertEquals("Division returns wrong numerator", -21, number3.getNumerator());
        assertEquals("Division returns wrong denominator", 8, number3.getDenominator());
    }

    //7
    @Test
    public void testPositiveDivideNegative(){
        Rational number1 = new Rational(7, 10);
        Rational number2 = new Rational(-5, 6);
        Rational number3 = number1.divide(number2);
        assertEquals("Division returns wrong numerator", -21, number3.getNumerator());
        assertEquals("Division returns wrong denominator", 25, number3.getDenominator());
    }

    //8
    @Test
    public void testZeroDivideNegative(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(-11, 17);
        Rational number3 = number1.divide(number2);
        assertEquals("Division returns wrong numerator", 0, number3.getNumerator());
        assertEquals("Division returns wrong denominator", 1, number3.getDenominator());
    }

    //9
    @Test
    public void testNegativeDivideNegative(){
        Rational number1 = new Rational(-1, 4);
        Rational number2 = new Rational(-2, 4);
        Rational number3 = number1.divide(number2);
        assertEquals("Division returns wrong numerator", 1, number3.getNumerator());
        assertEquals("Division returns wrong denominator", 2, number3.getDenominator());
    }
}
