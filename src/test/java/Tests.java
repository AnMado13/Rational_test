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
        assertEquals("Constructor for null returns a non-zero numerator", 0, number.getNumerator());
        assertEquals("Constructor for null returns a wrong denominator", 1, number.getDenominator());
    }

    @Test
    public void testPositiveNumeratorAndDenominatorConstructor(){
        Rational number = new Rational(3, 7);
        assertEquals("Constructor returns wrong numerator", 3, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 7, number.getDenominator());
    }

    @Test
    public void testNegativeNumeratorAndDenominatorConstructor(){
        Rational number = new Rational(-5, -11);
        assertEquals("Constructor returns wrong numerator", 5, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 11, number.getDenominator());
    }

    @Test
    public void testNegativeNumeratorPositiveDenominatorConstructor(){
        Rational number = new Rational(-2, 9);
        assertEquals("Constructor returns wrong numerator", -2, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 9, number.getDenominator());
    }

    @Test
    public void testPositiveNumeratorNegativeDenominatorConstructor(){
        Rational number = new Rational(17, -2);
        assertEquals("Constructor returns wrong numerator", -17, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, number.getDenominator());
    }

    @Test
    public void testFractionReductionPositiveNumbers(){
        Rational number = new Rational(18, 45);
        assertEquals("Constructor returns wrong numerator", 2, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 5, number.getDenominator());
    }

    @Test
    public void testFractionReductionNegativeNumbers(){
        Rational number = new Rational(-10, -25);
        assertEquals("Constructor returns wrong numerator", 2, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 5, number.getDenominator());
    }

    @Test
    public void testFractionReductionPositiveNegative(){
        Rational number = new Rational(50, -10);
        assertEquals("Constructor returns wrong numerator", -5, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 1, number.getDenominator());
    }

    @Test
    public void testFractionReductionNegativePositive(){
        Rational number = new Rational(-20, 20);
        assertEquals("Constructor returns wrong numerator", -1, number.getNumerator());
        assertEquals("Constructor returns wrong denominator", 1, number.getDenominator());
    }



}