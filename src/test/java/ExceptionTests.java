import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    static String message;
    static Rational zero;

    @BeforeClass
    public static void setUp(){
        message = "division by zero !";
        zero = new Rational(0, 1);
    }

    @Before
    public void prepareForException(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(message);
    }
    @Test
    public void testZeroDenominatorConstructor(){
        new Rational(1, 0);
    }
    @Test
    public void testPositiveDivideZero(){
        Rational positive = new Rational(1, 3);
        positive.divide(zero);
    }

    @Test
    public void testNegativeDivideZero(){
        Rational negative = new Rational(-2, 5);
        negative.divide(zero);
    }

    @Test
    public void testZeroDivideZero(){
        Rational zero2 = new Rational(0, 1);
        zero2.divide(zero);
    }

    @Test
    public void testZeroSelfDivision(){
        zero.divide(zero);
    }
}
