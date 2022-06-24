import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

public class ConstructorTests {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    Rational number;
    String message;

    @Test
    public void testStandardConstructor() {
        number = new Rational();
        message = "Standard constructor returns wrong %s";
        assertEquals(String.format(message,"numerator"), 0, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 1, number.getDenominator());

    }

    @Test
    public void testZeroNumeratorConstructor(){
        number = new Rational(0, 7);
        message = "Constructor for zero returns wrong %s";
        assertEquals(String.format(message, "numerator"), 0, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 1, number.getDenominator());
    }

    @Test
    public void testPositiveNumeratorAndDenominatorConstructor(){
        number = new Rational(3, 7);
        message = "Constructor for positive numerator and denominator returns wrong %s";
        assertEquals(String.format(message, "numerator"), 3, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 7, number.getDenominator());
    }

    @Test
    public void testNegativeNumeratorAndDenominatorConstructor(){
        number = new Rational(-5, -11);
        message = "Constructor for negative numerator and denominator returns wrong %s";
        assertEquals(String.format(message, "numerator"), 5, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 11, number.getDenominator());
    }

    @Test
    public void testNegativeNumeratorPositiveDenominatorConstructor(){
        number = new Rational(-2, 9);
        message = "Constructor for negative numerator and positive denominator returns wrong %s";
        assertEquals(String.format(message, "numerator"), -2, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 9, number.getDenominator());
    }

    @Test
    public void testPositiveNumeratorNegativeDenominatorConstructor(){
        number = new Rational(17, -2);
        message = "Constructor for positive numerator and negative denominator returns wrong %s";
        assertEquals(String.format(message, "numerator"), -17, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 2, number.getDenominator());
    }

    @Test
    public void testReductionPositivePositive(){
        number = new Rational(18, 45);
        message = "Constructor made wrong reduction for positive numerator and denominator: it returns incorrect %s";
        assertEquals(String.format(message, "numerator"), 2, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 5, number.getDenominator());
    }

    @Test
    public void testReductionNegativeNegative(){
        number = new Rational(-10, -25);
        message = "Constructor made wrong reduction for negative numerator and denominator: it returns incorrect %s";
        assertEquals(String.format(message, "numerator"), 2, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 5, number.getDenominator());
    }

    @Test
    public void testReductionPositiveNegative(){
        number = new Rational(50, -10);
        message = "Constructor made wrong reduction for positive numerator and negative denominator: it returns incorrect %s";
        assertEquals(String.format(message, "numerator"), -5, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 1, number.getDenominator());
    }

    @Test
    public void testReductionNegativePositive(){
        Rational number = new Rational(-20, 20);
        message = "Constructor made wrong reduction for negative numerator and positive denominator: it returns incorrect %s";
        assertEquals(String.format(message, "numerator"), -1, number.getNumerator());
        assertEquals(String.format(message,"denominator"), 1, number.getDenominator());
    }



}