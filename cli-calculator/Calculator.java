public class Calculator {
    /* This is just a basic calculator program using the CLI */
    /* Just run java Calculator in the command line to run */

    public Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        // Addition
        System.out.print("Addition: ");
        System.out.println(myCalculator.add(3,5));
        // Subtraction
        System.out.print("Subtraction: ");
        System.out.println(myCalculator.subtract(31, 20));
        // Multiplication
        System.out.print("Multiplication: ");
        System.out.println(myCalculator.multiply(21, 10));
        // Division
        System.out.print("Division: ");
        System.out.println(myCalculator.divide(21, 3));
    }
}