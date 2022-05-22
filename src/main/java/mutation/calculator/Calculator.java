package mutation.calculator;

public class Calculator {

    public Calculator() {}

    public int subtract(Integer a, Integer b) {
        return a - b;
    }

    public int add(Integer a, Integer b) {
        return a + b;
    }

    public double divide(Double a, Double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by 0!");
        }
        return a / b;
    }

    public int multiply(Integer a, Integer b) {
        return a * b;
    }

    public boolean isPositive(Integer a) {
        return a > 0;
    }

    public boolean isNegative(Integer a) {
        return a < 0;
    }

    public int getFactorial(Integer factorial) {
        int result = 1;
        while (factorial != 1) {
            result = multiply(result, factorial);
            factorial--;
        }
        return result;
    }
}
