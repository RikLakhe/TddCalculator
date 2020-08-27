package global.citytech.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    //    delta - the maximum delta between expected and actual for which both numbers are still considered equal.
    private static final double DELTA = 1e-15;

    @Test(expected = IllegalArgumentException.class)
    public void doInitialTesting() {
        Calculator c = new Calculator();
        c.initialTesting();
    }

    @Test
    public void doGetResultTesting() {
        Calculator c = new Calculator();
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void doCleanTesting() {
        Calculator c = new Calculator();
        c.addNumbers(22, 11);
        c.cleanResult();
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void add_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(22, 11);
        double receivedResult = c.getResult();
        assertEquals(33, receivedResult, DELTA);
    }

    @Test
    public void add_Zeros_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(0, 0);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void add_FirstNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(-22, 11);
        double receivedResult = c.getResult();
        assertEquals(-11, receivedResult, DELTA);
    }

    @Test
    public void add_SecondNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.addNumbers(22, -11);
        double receivedResult = c.getResult();
        assertEquals(11, receivedResult, DELTA);
    }

    @Test
    public void subtract_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(22, 11);
        double receivedResult = c.getResult();
        assertEquals(11, receivedResult, DELTA);
    }

    @Test
    public void subtract_SecondNumber_Greater_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(22, 33);
        double receivedResult = c.getResult();
        assertEquals(-11, receivedResult, DELTA);
    }

    @Test
    public void subtract_SecondNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(22, -33);
        double receivedResult = c.getResult();
        assertEquals(55, receivedResult, DELTA);
    }

    @Test
    public void subtract_FirstNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(-22, 33);
        double receivedResult = c.getResult();
        assertEquals(-55, receivedResult, DELTA);
    }

    @Test
    public void subtract_BothNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.subtractNumbers(-22, -33);
        double receivedResult = c.getResult();
        assertEquals(11, receivedResult, DELTA);
    }

    @Test
    public void multiply_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(2, 3);
        double receivedResult = c.getResult();
        assertEquals(6, receivedResult, DELTA);
    }

    @Test
    public void multiply_FirstNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(-2, 3);
        double receivedResult = c.getResult();
        assertEquals(-6, receivedResult, DELTA);
    }

    @Test
    public void multiply_SecondNumber_Negative_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(2, -3);
        double receivedResult = c.getResult();
        assertEquals(-6, receivedResult, DELTA);
    }

    @Test
    public void multiply_BothNumbers_Negative_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(-2, -3);
        double receivedResult = c.getResult();
        assertEquals(6, receivedResult, DELTA);
    }

    @Test
    public void multiply_With_Zero_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(0, -3);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void multiply_Both_Zeros_Testing() {
        Calculator c = new Calculator();
        c.multiplyNumbers(0, 0);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void divide_Testing() {
        Calculator c = new Calculator();
        c.divideNumbers(10, 3);
        double receivedResult = c.getResult();
        assertEquals(3.3333333333333335, receivedResult, DELTA);
    }

    @Test
    public void divide_FirstNumber_Zero_Testing() {
        Calculator c = new Calculator();
        c.divideNumbers(0, 3);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_SecondNumber_Zero_Testing() {
        Calculator c = new Calculator();
        try {
            c.divideNumbers(10, 0);
        } catch (IllegalArgumentException err) {
            String message = "Cannot be divided by Zero! Its infinity.";
            assertEquals(message, err.getMessage());
            throw err;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_Both_Zero_Testing() {
        Calculator c = new Calculator();
        try {
            c.divideNumbers(0, 0);
        } catch (IllegalArgumentException err) {
            String message = "Cannot be divided by Zero! Its infinity.";
            assertEquals(message, err.getMessage());
            throw err;
        }
    }

    @Test
    public void power_SecondNumber_Testing() {
        Calculator c = new Calculator();
        c.powerNumber(2, 6);
        double receivedResult = c.getResult();
        assertEquals(64, receivedResult, DELTA);
    }

    @Test
    public void power_By_Zero_Testing() {
        Calculator c = new Calculator();
        c.powerNumber(2, 0);
        double receivedResult = c.getResult();
        assertEquals(1, receivedResult, DELTA);
    }

    @Test
    public void power_Of_Negative_Testing() {
        Calculator c = new Calculator();
        c.powerNumber(-2, 10);
        double receivedResult = c.getResult();
        assertEquals(1024, receivedResult, DELTA);
        c.powerNumber(-2, 7);
        receivedResult = c.getResult();
        assertEquals(-128, receivedResult, DELTA);
    }

    @Test
    public void power_By_Negative_Testing() {
        Calculator c = new Calculator();
        c.powerNumber(2, -10);
        double receivedResult = c.getResult();
        assertEquals(9.765625E-4, receivedResult, DELTA);
    }

    @Test
    public void squareRoot_Number_Testing() {
        Calculator c = new Calculator();
        c.squareRoot(4);
        double receivedResult = c.getResult();
        assertEquals(2, receivedResult, DELTA);
    }

    @Test
    public void squareRoot_Zero_Testing() {
        Calculator c = new Calculator();
        c.squareRoot(0);
        double receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void squareRoot_NegativeNumber_Testing() {
        Calculator c = new Calculator();
        try {
            c.squareRoot(-4);
        } catch (IllegalArgumentException err) {
            String message = "Square root of negative number is irrational number.";
            assertEquals(message, err.getMessage());
            throw err;
        }
    }

    @Test
    public void cubeRoot_Number_Testing() {
        Calculator c = new Calculator();
        c.cubeRoot(27);
        double receivedResult = c.getResult();
        assertEquals(3, receivedResult, DELTA);

        c.cubeRoot(0);
        receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);

        c.cubeRoot(-27);
        receivedResult = c.getResult();
        assertEquals(-3, receivedResult, DELTA);
    }

    @Test
    public void sin_Number_Testing() {
        Calculator c = new Calculator();
        c.sinNumber(60);
        double receivedResult = c.getResult();
        assertEquals(-0.3048106211022167, receivedResult, DELTA);

        c.sinNumber(-60);
        receivedResult = c.getResult();
        assertEquals(0.3048106211022167, receivedResult, DELTA);

        c.sinNumber(90);
        receivedResult = c.getResult();
        assertEquals(0.8939966636005579, receivedResult, DELTA);

        c.sinNumber(-90);
        receivedResult = c.getResult();
        assertEquals(-0.8939966636005579, receivedResult, DELTA);

        c.sinNumber(0);
        receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test
    public void cos_Number_Testing() {
        Calculator c = new Calculator();
        c.cosNumber(60);
        double receivedResult = c.getResult();
        assertEquals(-0.9524129804151563, receivedResult, DELTA);

        c.cosNumber(-60);
        receivedResult = c.getResult();
        assertEquals(-0.9524129804151563, receivedResult, DELTA);

        c.cosNumber(90);
        receivedResult = c.getResult();
        assertEquals(-0.4480736161291701, receivedResult, DELTA);

        c.cosNumber(-90);
        receivedResult = c.getResult();
        assertEquals(-0.4480736161291701, receivedResult, DELTA);

        c.cosNumber(0);
        receivedResult = c.getResult();
        assertEquals(1, receivedResult, DELTA);
    }

    @Test
    public void tan_Number_Testing() {
        Calculator c = new Calculator();
        c.tanNumber(60);
        double receivedResult = c.getResult();
        assertEquals(0.320040389379563, receivedResult, DELTA);

        c.tanNumber(-60);
        receivedResult = c.getResult();
        assertEquals(-0.320040389379563, receivedResult, DELTA);

        c.tanNumber(90);
        receivedResult = c.getResult();
        assertEquals(-1.995200412208242, receivedResult, DELTA);

        c.tanNumber(-90);
        receivedResult = c.getResult();
        assertEquals(1.995200412208242, receivedResult, DELTA);

        c.tanNumber(0);
        receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ln_Number_Testing() {
        Calculator c = new Calculator();
        c.lnNumber(464);
        double receivedResult = c.getResult();
        assertEquals(6.139884552226255, receivedResult, DELTA);

        c.lnNumber(1);
        receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);

        c.lnNumber(90);
        receivedResult = c.getResult();
        assertEquals(4.499809670330265, receivedResult, DELTA);

        try {
            c.lnNumber(0);
        } catch (IllegalArgumentException err) {
            String message = "Cannot be zero! Its Infinity!";
            assertEquals(message, err.getMessage());
            throw err;
        }

        try {
            c.lnNumber(-1);
        } catch (IllegalArgumentException err) {
            String message = "Cannot be negative!";
            assertEquals(message, err.getMessage());
            throw err;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void log_Number_Testing() {
        Calculator c = new Calculator();
        c.logNumber(464);
        double receivedResult = c.getResult();
        assertEquals(2.6665179805548807, receivedResult, DELTA);

        c.logNumber(1);
        receivedResult = c.getResult();
        assertEquals(0, receivedResult, DELTA);

        c.logNumber(90);
        receivedResult = c.getResult();
        assertEquals(1.954242509439325, receivedResult, DELTA);

        try {
            c.logNumber(0);
        } catch (IllegalArgumentException err) {
            String message = "Cannot be zero! Its Infinity!";
            assertEquals(message, err.getMessage());
            throw err;
        }

        try {
            c.logNumber(-1);
        } catch (IllegalArgumentException err) {
            String message = "Cannot be negative!";
            assertEquals(message, err.getMessage());
            throw err;
        }
    }
}
