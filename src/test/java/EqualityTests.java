import org.junit.*;
import static org.junit.Assert.*;

public class EqualityTests {

    static String message;
    Rational firstNumber;
    Rational secondNumber;

    @BeforeClass
    public static void createMessage(){
        message = "Equality failed: ";
    }

    //Warnings are incorrect, because we test "equals" method in our class
    @Test
    public  void testZeroEqual(){
        firstNumber = new Rational();
        secondNumber = new Rational();
        assertTrue(message + "Zero is not equal zero", firstNumber.equals(secondNumber));
    }
    @Test
    public void testNegativeEqual(){
        firstNumber = new Rational(-1, 3);
        secondNumber = new Rational(-1, 3);
        assertTrue(message + "Negative is not equal itself", firstNumber.equals(secondNumber));
    }

    @Test
    public void testPositiveEqual(){
        firstNumber = new Rational(3, 5);
        secondNumber = new Rational(3, 5);
        assertTrue(message + "Positive is not equal itself", firstNumber.equals(secondNumber));
    }

    @Test
    public void testDifferentSignsNotEqual(){
        firstNumber = new Rational(-4, 7);
        secondNumber = new Rational(4, 7);
        assertFalse(message + "Numbers with different signs are equal", firstNumber.equals(secondNumber));
    }

    @Test
    public void testDifferentPositiveNotEqual(){
        firstNumber = new Rational(3, 4);
        secondNumber = new Rational(2, 5);
        assertFalse(message + "Different positive numbers are equal", firstNumber.equals(secondNumber));
    }

    @Test
    public void testDifferentNegativeNotEqual(){
        firstNumber = new Rational(-5, 4);
        secondNumber = new Rational(-6, 5);
        assertFalse(message + "Different positive numbers are equal", firstNumber.equals(secondNumber));
    }

    @Test
    public void testRationalNotNull(){
        Rational number1 = new Rational();
        assertFalse(message+ "Rational is Null", number1.equals(null));
    }

    @Test
    public void testRationalNotOtherClass(){
        Rational number1 = new Rational();
        assertFalse(message + "Rational is a number from another Class", number1.equals(0));
    }
}
