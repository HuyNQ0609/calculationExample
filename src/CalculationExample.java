import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        extracted(scanner);

    }

    private static void extracted(Scanner scanner) {
        try {
            System.out.println("Enter x: ");
            double x = scanner.nextInt();
            System.out.println("Enter y: ");
            double y = scanner.nextInt();
            calculate(x, y);
        } catch(InputMismatchException e) {
            System.err.println("The input value must be an integer!");
        }
    }

    private static void calculate(double x, double y) {
        try {
            double a = x + y;
            double b = x - y;
            double c = x * y;
            double d = x / y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x * y = " + c);
            System.out.println("x / y = " + d);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot be divided by 0.");
        }
    }
}