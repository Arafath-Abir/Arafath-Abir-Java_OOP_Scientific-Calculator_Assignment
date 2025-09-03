import java.util.Scanner;
import static java.lang.Math.*;

public class OOP_project {

    private static Double readDouble(Scanner in, String prompt) {
        System.out.print(prompt + ": ");
        while (!in.hasNextDouble()) {
            System.out.print("Please enter a valid number. " + prompt + ": ");
            in.next();
        }
        return in.nextDouble();
    }

    private static long readNonNegativeInt(Scanner in, String prompt) {
        System.out.print(prompt + " (non-negative integer): ");
        while (!in.hasNextInt()) {
            System.out.print("Please enter a non-negative integer. " + prompt + ": ");
            in.next();
        }
        int n = in.nextInt();
        while (n < 0) {
            System.out.print("Must be >= 0. " + prompt + ": ");
            while (!in.hasNextInt()) { in.next(); }
            n = in.nextInt();
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Calculator ===");
            System.out.println("0.  Exit");
            System.out.println("1.  Addition (x + y)");
            System.out.println("2.  Subtraction (x - y)");
            System.out.println("3.  Multiplication (x * y)");
            System.out.println("4.  Division (x / y)");
            System.out.println("5.  Cube (x^3)");
            System.out.println("6.  Square root (√x)");
            System.out.println("7.  Square (x^2)");
            System.out.println("8.  Power (x^y)");
            System.out.println("9.  Reciprocal (1/x)");
            System.out.println("10. y-th root (x^(1/y))");
            System.out.println("11. Cube root (∛x)");
            System.out.println("12. Modulus (x % y)");
            System.out.println("13. Factorial (n!)");
            System.out.println("14. Percentage (x% of y)");
            System.out.println("15. log10(x)");
            System.out.println("16. 10^x");
            System.out.println("17. sin(x°)");
            System.out.println("18. cos(x°)");
            System.out.println("19. tan(x°)");
            System.out.println("20. cot(x°) = 1/tan(x°)");
            System.out.println("21. sec(x°) = 1/cos(x°)");
            System.out.println("22. csc(x°) = 1/sin(x°)");
            System.out.print("Select an option: ");

            String op = input.next().trim();

            try {
                switch (op) {
                    case "0":
                        System.out.println("Goodbye!");
                        return;

                    case "1": {
                        double x = readDouble(input, "Enter first number");
                        double y = readDouble(input, "Enter second number");
                        System.out.println(x + " + " + y + " = " + (x + y));
                        break;
                    }
                    case "2": {
                        double x = readDouble(input, "Enter first number");
                        double y = readDouble(input, "Enter second number");
                        System.out.println(x + " - " + y + " = " + (x - y));
                        break;
                    }
                    case "3": {
                        double x = readDouble(input, "Enter first number");
                        double y = readDouble(input, "Enter second number");
                        System.out.println(x + " * " + y + " = " + (x * y));
                        break;
                    }
                    case "4": {
                        double x = readDouble(input, "Enter first number");
                        double y = readDouble(input, "Enter second number");
                        if (y == 0) {
                            System.out.println("Error: division by zero");
                        } else {
                            System.out.println(x + " / " + y + " = " + (x / y));
                        }
                        break;
                    }
                    case "5": {
                        double x = readDouble(input, "Enter number");
                        System.out.println(x + "^3 = " + pow(x, 3));
                        break;
                    }
   

