import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    String message = "division by zero !";
    @Test
    public void testZeroDenominatorConstructor(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(message);
        new Rational(1, 0);
    }
    @Test
    public void testPositiveDivideZero(){
        Rational number1 = new Rational(1, 3);
        Rational number2 = new Rational(0, 1);
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(message);
        number1.divide(number2);
    }

    @Test
    public void testNegativeDivideZero(){
        Rational number1 = new Rational(-2, 5);
        Rational number2 = new Rational(0, 1);
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(message);
        number1.divide(number2);
    }

    @Test
    public void testZeroDivideZero(){
        Rational number1 = new Rational(0, 1);
        Rational number2 = new Rational(0, 1);
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(message);
        number1.divide(number2);
    }
}
