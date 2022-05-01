import org.junit.*;
import static org.junit.Assert.*;

public class LessOrEqualTests {

    //1
    @Test
    public void testZeroLessOrEqualZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0, 1);
        assertTrue("Zero cannot be less or greater than zero", number1.lessOrEqual(number2));
    }

    //2
    @Test
    public void testPositiveLessOrEqualItself(){
        Rational number1 = new Rational(13, 3);
        Rational number2 = new Rational(13, 3);
        assertTrue("Positive number cannot be less or greater than itself", number1.lessOrEqual(number2));
    }

    //3
    @Test
    public void testNegativeLessOrEqualItself(){
        Rational number1 = new Rational(-5, 4);
        Rational number2 = new Rational(-5, 4);
        assertTrue("Negative number cannot be less or greater than itself", number1.lessOrEqual(number2));
    }

    //4
    @Test
    public void testLessOrEqualSelf(){
        Rational number1 = new Rational(-3, 19);
        assertTrue("Inequality does not hold", number1.lessOrEqual(number1));
    }

    //5
    @Test
    public void testGreaterNotLessOrEqualLesserPositive(){
        Rational number1 = new Rational(9, 8);
        Rational number2 = new Rational(4, 7);
        assertFalse("A greater number cannot be less or equal than a smaller one", number1.lessOrEqual(number2));
    }

    //6
    @Test
    public  void testGreaterNotLessOrEqualLesserNegative(){
        Rational number1 = new Rational(-7, 7);
        Rational number2 = new Rational(-8, 7);
        assertFalse("A greater number cannot be less or equal than a smaller one", number1.lessOrEqual(number2));
    }

    //7
    @Test
    public  void testGreaterNotLessOrEqualLesserDifferentSigns(){
        Rational number1 = new Rational(1, 5);
        Rational number2 = new Rational(-8, 3);
        assertFalse("A greater number cannot be less or equal than a smaller one", number1.lessOrEqual(number2));
    }

    //8
    @Test
    public void testLesserLessOrEqualGreater(){
        Rational number1 = new Rational(2, 5);
        Rational number2 = new Rational(3, 5);
        assertTrue("Inequality does not hold", number1.lessOrEqual(number2));
    }


}
