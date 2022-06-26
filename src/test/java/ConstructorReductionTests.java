import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ConstructorReductionTests {

    int numerator;
    int denominator;
    Rational number;
    String message;
    @Test
    public void checkSignTransfer(){
        message = "Transfer of sign from denominator failed";
        numerator = 5;
        denominator = -3;
        number = new Rational(numerator, denominator);
        assertEquals(message, new Rational(-numerator, -denominator), number);
    }

    @Test
    public void checkReductionForZero(){
        message = "Reduction of denominator with zero numerator failed";
        numerator = 0;
        denominator = 7;
        number = new Rational(numerator, denominator);
        assertEquals(message, new Rational(), number);
    }

    @Test
    public void checkReductionForPositive(){
        message = "Reduction for positive number failed";
        numerator = 10;
        denominator = 20;
        number = new Rational(numerator, denominator);
        assertEquals(message, new Rational(1, 2), number);
    }

    @Test
    public void checkReductionForNegative(){
        message = "Reduction for negative number failed";
        numerator = -7;
        denominator = 21;
        number = new Rational(numerator, denominator);
        assertEquals(message, new Rational(-1, 3), number);
    }
}
