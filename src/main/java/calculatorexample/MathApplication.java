package calculatorexample;

public class MathApplication {

    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double add(double number1, double number2) {
        return calculatorService.add(number1, number2);
    }

    public double substract(double number1, double number2) {
        return calculatorService.substract(number1, number2);
    }

    public double multiply(double number1, double number2) {
        return calculatorService.multiply(number1, number2);
    }

    public double divide(double number1, double number2) {
        return calculatorService.divide(number1, number2);
    }
}
