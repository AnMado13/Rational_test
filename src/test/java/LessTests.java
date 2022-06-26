import org.junit.*;
import static org.junit.Assert.*;

public class LessTests {

    static String message;
    Rational firstNumber;
    Rational secondNumber;

    @BeforeClass
    public static void createMessage(){
        message = "Strict Inequality failed: ";
    }

    @Test
    public void testStrictInequalityHoldsForPositive(){
        firstNumber = new Rational(2, 1);
        secondNumber = new Rational(7, 2);
        assertTrue(message + "Lesser number isn't less than greater (for positive)", firstNumber.less(secondNumber));
    }

    @Test
    public void testStrictInequalityHoldsForNegative(){
        firstNumber = new Rational(-2, 3);
        secondNumber = new Rational(-1, 5);
        assertTrue(message + "Lesser number isn't less than greater (for negative)", firstNumber.less(secondNumber));
    }

    @Test
    public void testStrictInequalityHoldsForDifferentSigns(){
        firstNumber = new Rational(-10, 3);
        secondNumber = new Rational(3, 4);
        assertTrue(message + "Negative number isn't less than positive", firstNumber.less(secondNumber));
    }

    @Test
    public void testZeroNotLessZero(){
        firstNumber = new Rational(0, 1);
        secondNumber = new Rational(0,1);
        assertFalse(message + "Zero less than zero", firstNumber.less(secondNumber));
    }

    @Test
    public void testPositiveNotLessItself(){
        firstNumber = new Rational(3, 2);
        secondNumber = new Rational(3,2);
        assertFalse(message + "Positive less than itself", firstNumber.less(secondNumber));
    }

    @Test
    public void testNegativeNotLessItself(){
        firstNumber = new Rational(-2, 5);
        secondNumber = new Rational(-2, 5);
        assertFalse(message + "Negative less than itself", firstNumber.less(secondNumber));
    }

    @Test
    public void testGreaterNotLessLesser(){
        firstNumber = new Rational(3, 4);
        secondNumber = new Rational(1, 5);
        assertFalse(message + "Greater less than a lesser one", firstNumber.less(secondNumber));
    }

}
