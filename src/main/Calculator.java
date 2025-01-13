import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the calculator! Please enter your first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter your second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Elija una operación (+, -, *, /): ");
        String operator = scanner.next();

        double result;
        switch (operator) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = substract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                result = divide(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
        System.out.println("Result: " + result);
    }

    public double add(double a, double b) {
        return a + b;
    }
    public double substract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}