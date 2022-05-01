import org.junit.*;
import static org.junit.Assert.*;

public class LessTests {

    //1
    @Test
    public void testZeroNotLessZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0,1);
        assertFalse("Zero cannot be less than zero", number1.less(number2));
    }

    //2
    @Test
    public void testPositiveNotLessItself(){
        Rational number1 = new Rational(3, 2);
        Rational number2 = new Rational(3,2);
        assertFalse("Positive number cannot be less than itself", number1.less(number2));
    }

    //3
    @Test
    public void testNegativeNotLessItself(){
        Rational number1 = new Rational(-2, 5);
        Rational number2 = new Rational(-2, 5);
        assertFalse("Negative number cannot be less than itself", number1.less(number2));
    }

    //4
    @Test
    public void testLessSelf(){
        Rational number1 = new Rational(0, 1);
        assertFalse("Impossible inequality", number1.less(number1));
    }

    //5
    @Test
    public void testGreaterNotLessLesser(){
        Rational number1 = new Rational(3, 4);
        Rational number2 = new Rational(1, 5);
        assertFalse("A greater number cannot be less than a lesser one", number1.less(number2));
    }

    //6
    @Test
    public void testLesserLessGreaterForPositive(){
        Rational number1 = new Rational(2, 1);
        Rational number2 = new Rational(7, 2);
        assertTrue("The inequality does not hold", number1.less(number2));
    }


    //7
    @Test
    public void testLesserLessGreaterForNegative(){
        Rational number1 = new Rational(-2, 3);
        Rational number2 = new Rational(-1, 5);
        assertTrue("The inequality does not hold", number1.less(number2));
    }

    //8
    @Test
    public void testLesserLessGreaterDifferentSigns(){
        Rational number1 = new Rational(-10, 3);
        Rational number2 = new Rational(3, 4);
        assertTrue("The inequality does not hold", number1.less(number2));
    }

}
