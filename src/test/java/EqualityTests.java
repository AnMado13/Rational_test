import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EqualityTests {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {0, 1, 0, 1, }
        });
    }

    String message;
    Rational firstNumber;
    Rational secondNumber;

    public EqualityTests(int firstNumerator,
                         int firstDenominator,
                         int secondNumerator,
                         int secondDenominator,
                         String fragmentMessage
    ){
        this.message = String.format("Addition %s failed", fragmentMessage);
        this.firstNumber = new Rational(firstNumerator, firstDenominator);
        this.secondNumber = new Rational(secondNumerator, secondDenominator);
    }
    //Warnings are incorrect, because we test "equals" method in our class
    @Test
    public void testEquality(){
        assertTrue("Equality is violated", firstNumber.equals(secondNumber));
    }

    //3
    @Test
    public void testNegativeEqual(){
        Rational number1 = new Rational(-1, 3);
        Rational number2 = new Rational(-1, 3);
        assertTrue("Equality is violated", number1.equals(number2));
    }

    //4
    @Test
    public void testPositiveEqual(){
        Rational number1 = new Rational(3, 5);
        Rational number2 = new Rational(3, 5);
        assertEquals("Equality is violated", number1, number2);
    }

    //5
    @Test
    public void testDifferentSignsNotEqual(){
        Rational number1 = new Rational(2, 11);
        Rational number2 = new Rational(-2, 11);
        assertFalse("Impossible equality", number1.equals(number2));
    }

    //6
    @Test
    public void testPositiveNotEqual(){
        Rational number1 = new Rational(3, 17);
        Rational number2 = new Rational(7, 8);
        assertFalse("Impossible equality", number1.equals(number2));
    }

    //7
    @Test
    public void testNegativeNotEqual(){
        Rational number1 = new Rational(-4, 19);
        Rational number2 = new Rational(-5, 2);
        assertFalse("Impossible equality", number1.equals(number2));
    }

    //8
    @Test
    public void testRationalNotNull(){
        Rational number1 = new Rational();
        assertFalse("Rational is Null", number1.equals(null));
    }

    //9
    @Test
    public void testRationalNotOtherClass(){
        Rational number1 = new Rational();
        assertFalse("Rational number equals number from another Class", number1.equals(0));
    }
}
