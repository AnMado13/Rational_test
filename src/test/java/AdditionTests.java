import org.junit.*;
import static org.junit.Assert.*;

public class AdditionTests {

    //1
    @Test
    public void testZeroPlusZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0, 1);
        Rational sum = number1.plus(number2);
        assertEquals("Addition returns wrong numerator", 0, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 1, sum.getDenominator());
    }

    //2
    @Test
    public void testZeroPlusNotZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(3, 8);
        Rational sum = number1.plus(number2);
        assertEquals("Addition returns wrong numerator", 3, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 8, sum.getDenominator());
    }

    //3
    @Test
    public void testNotZeroPlusZero(){
        Rational number1 = new Rational(5, 11);
        Rational number2 = new Rational(0, 1);
        Rational sum = number1.plus(number2);
        assertEquals("Addition returns wrong numerator", 5, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 11, sum.getDenominator());
    }

    //4
    @Test
    public void testPositivePlusPositive(){
        Rational number1 = new Rational(3, 2);
        Rational number2 = new Rational(4, 3);
        Rational sum = number1.plus(number2);
        assertEquals("Addition returns wrong numerator", 17, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 6, sum.getDenominator());
    }

    //5
    @Test
    public void testPositivePlusNegative(){
        Rational number1 = new Rational(2, 3);
        Rational number2 = new Rational(-1, 4);
        Rational sum = number1.plus(number2);
        assertEquals("Addition returns wrong numerator", 5, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 12, sum.getDenominator());
    }

    //6
    @Test
    public void testNegativePlusPositive(){
        Rational number1 = new Rational(-1, 4);
        Rational number2 = new Rational(2, 3);
        Rational sum = number1.plus(number2);
        assertEquals("Addition returns wrong numerator", 5, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 12, sum.getDenominator());
    }

    //7
    @Test
    public void testNegativePlusNegative(){
        Rational number1 = new Rational(-2, 3);
        Rational number2 = new Rational(-3, 3);
        Rational sum = number1.plus(number2);
        assertEquals("Addition returns wrong numerator", -5, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 3, sum.getDenominator());
    }

    //8
    @Test
    public void testSelfSum(){
        Rational number = new Rational(1, 2);
        Rational sum = number.plus(number);
        assertEquals("Addition returns wrong numerator", 1, sum.getNumerator());
        assertEquals("Addition returns wrong denominator", 1, sum.getDenominator());
    }
}
