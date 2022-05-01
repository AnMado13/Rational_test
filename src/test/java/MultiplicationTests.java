import org.junit.*;
import static org.junit.Assert.*;

public class MultiplicationTests {

    //1
    @Test
    public void testZeroMultiplyZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0, 1);
        Rational product = number1.multiply(number2);
        assertEquals("Multiplication returns wrong numerator", 0, product.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 1, product.getDenominator());
    }

    //2
    @Test
    public void testZeroMultiplyNotZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(3, 4);
        Rational product = number1.multiply(number2);
        assertEquals("Multiplication returns wrong numerator", 0, product.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 1, product.getDenominator());
    }

    //3
    @Test
    public void testNonZeroMultiplyZero(){
        Rational number1 = new Rational(2, 1);
        Rational number2 = new Rational(0, 1);
        Rational product = number1.multiply(number2);
        assertEquals("Multiplication returns wrong numerator", 0, product.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 1, product.getDenominator());
    }

    //4
    @Test
    public void testPositiveMultiplyPositive(){
        Rational number1 = new Rational(1 , 2);
        Rational number2 = new Rational(2, 1);
        Rational product = number1.multiply(number2);
        assertEquals("Multiplication returns wrong numerator", 1, product.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 1, product.getDenominator());
    }

    //5
    @Test
    public void testPositiveMultiplyNegative(){
        Rational number1 = new Rational(5, 7);
        Rational number2 = new Rational(-3, 5);
        Rational product = number1.multiply(number2);
        assertEquals("Multiplication returns wrong numerator", -3, product.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 7, product.getDenominator());
    }

    //6
    @Test
    public void testNegativeMultiplyPositive(){
        Rational number1 = new Rational(-10, 17);
        Rational number2 = new Rational(3, 10);
        Rational product = number1.multiply(number2);
        assertEquals("Multiplication returns wrong numerator", -3, product.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 17, product.getDenominator());
    }

    //7
    @Test
    public void testNegativeMultiplyNegative(){
        Rational number1 = new Rational(-23, 31);
        Rational number2 = new Rational(-31, 23);
        Rational product = number1.multiply(number2);
        assertEquals("Multiplication returns wrong numerator", 1, product.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 1, product.getDenominator());
    }

    //8
    @Test
    public void testSquare(){
        Rational number1 = new Rational(-3, 5);
        Rational square = number1.multiply(number1);
        assertEquals("Multiplication returns wrong numerator", 9, square.getNumerator());
        assertEquals("Multiplication returns wrong denominator", 25, square.getDenominator());
    }
}
