import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;


public class Tests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());

    }

    @Test
    public void testPositiveNumeratorZeroConstructor(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        Rational number = new Rational(3, 0);
    }

    @Test
    public void testNegativeNumeratorZeroConstructor(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        Rational number = new Rational(-5, 0);
    }

    @Test
    public void testZeroNumeratorZeroConstructor(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        Rational number = new Rational(0, 0);
    }

    @Test
    public void testZeroNumeratorConstructor(){
        Rational number = new Rational(0, 7);
        assertEquals("Null has a non-zero numerator", 0, number.getNumerator());
        assertEquals("Null has a wrong denominator", 1, number.getDenominator());
    }

}