import org.junit.*;
import static org.junit.Assert.*;

public class LessOrEqualTests {

    static String message;
    Rational firstNumber;
    Rational secondNumber;

    @BeforeClass
    public static void createMessage(){
        message = "Inequality failed: ";
    }

    @Test
    public void testInequalityHoldsForPositive(){
        firstNumber = new Rational(2, 1);
        secondNumber = new Rational(7, 2);
        assertTrue(message + "Lesser number isn't less or equal than greater (for positive)", firstNumber.lessOrEqual(secondNumber));
    }

    @Test
    public void testInequalityHoldsForNegative(){
        firstNumber = new Rational(-2, 3);
        secondNumber = new Rational(-1, 5);
        assertTrue(message + "Lesser number isn't less or equal than greater (for negative)", firstNumber.lessOrEqual(secondNumber));
    }

    @Test
    public void testInequalityHoldsForDifferentSigns(){
        firstNumber = new Rational(-10, 3);
        secondNumber = new Rational(3, 4);
        assertTrue(message + "Negative number isn't less or equal than positive", firstNumber.lessOrEqual(secondNumber));
    }

    @Test
    public void testZeroLessOrEqualZero(){
        firstNumber = new Rational(0, 1);
        secondNumber = new Rational(0,1);
        assertTrue(message + "Zero isn't less or equal zero", firstNumber.lessOrEqual(secondNumber));
    }

    @Test
    public void testPositiveLessOrEqualItself(){
        firstNumber = new Rational(3, 2);
        secondNumber = new Rational(3,2);
        assertTrue(message + "Positive number isn't less or equal than itself", firstNumber.lessOrEqual(secondNumber));
    }

    @Test
    public void testNegativeNotLessItself(){
        firstNumber = new Rational(-2, 5);
        secondNumber = new Rational(-2, 5);
        assertTrue(message + "Negative number isn't less or equal than itself", firstNumber.lessOrEqual(secondNumber));
    }

    @Test
    public void testGreaterNotLessOrEqualLesser(){
        firstNumber = new Rational(3, 4);
        secondNumber = new Rational(1, 5);
        assertFalse(message + "Greater number less or equal than a lesser one", firstNumber.lessOrEqual(secondNumber));
    }

}
