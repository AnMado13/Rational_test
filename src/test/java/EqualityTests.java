import org.junit.*;
import static org.junit.Assert.*;

public class EqualityTests {

    //1
    @Test
    public void testSelfEquality(){
        Rational number1 = new Rational(2, 9);
        assertTrue("Equality is violated", number1.equals(number1));
    }

    //2
    @Test
    public void testZeroEqualZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0, 1);
        assertTrue("Equality is violated", number1.equals(number2));
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
        assertTrue("Equality is violated", number1.equals(number2));
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
