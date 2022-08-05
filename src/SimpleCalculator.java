public class SimpleCalculator implements Calculator {

    private double number1 = 0;
    private double number2 = 0;

    public SimpleCalculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * overrides from Calculator interface.
     * @return the values of number1 and number2 that the user assigns for them.
     */
    @Override
    public double add() {
        return number1 + number2;
    }
    @Override
    public double subtract() {
        return number1 - number2;
    }
    @Override
    public double multiply() {
        return number1 * number2;
    }
    @Override
    public double divide() {
        return number1 / number2;
    }
    @Override
    public double root() {
        return Math.round(Math.pow(number1, 1.0 / number2));
    }
    @Override
    public double power() {
        return Math.round(Math.pow(number1, number2));
    }
}
