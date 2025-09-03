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
                    case "6": {
                        double x = readDouble(input, "Enter number");
                        if (x < 0) System.out.println("Warning: √ of negative is NaN for real numbers.");
                        System.out.println("√" + x + " = " + sqrt(x));
                        break;
                    }
                    case "7": {
                        double x = readDouble(input, "Enter number");
                        System.out.println(x + "^2 = " + pow(x, 2));
                        break;
                    }
                    case "8": {
                        double x = readDouble(input, "Enter base x");
                        double y = readDouble(input, "Enter exponent y");
                        System.out.println("x^y = " + pow(x, y));
                        break;
                    }
                    case "9": {
                        double x = readDouble(input, "Enter number");
                        if (x == 0) System.out.println("Error: 1/0 undefined");
                        else       System.out.println("1/" + x + " = " + (1.0 / x));
                        break;
                    }
                    case "10": {
                        double x = readDouble(input, "Enter number x");
                        double y = readDouble(input, "Enter root y");
                        if (y == 0) {
                            System.out.println("Error: y cannot be 0");
                        } else {
                            System.out.println("x^(1/y) = " + pow(x, 1.0 / y));
                        }
                        break;
                    }
                    case "11": {
                        double x = readDouble(input, "Enter number");
                        System.out.println("cbrt(x) = " + cbrt(x));
                        break;
                    }
                    case "12": {
                        double x = readDouble(input, "Enter first number");
                        double y = readDouble(input, "Enter second number");
                        if (y == 0) System.out.println("Error: modulus by zero");
                        else        System.out.println("x % y = " + (x % y));
                        break;
                    }
                    case "13": {
                        long n = readNonNegativeInt(input, "Enter n");
                        // simple iterative factorial (beware overflow >20!)
                        long fact = 1;
                        for (long i = 2; i <= n; i++) fact *= i;
                        System.out.println(n + "! = " + fact);
                        break;
                    }
                    case "14": {
                        double percent = readDouble(input, "Enter percentage x");
                        double of = readDouble(input, "Enter value y");
                        System.out.println(percent + "% of " + of + " = " + (percent * of / 100.0));
                        break;
                    }
                    case "15": {
                        double x = readDouble(input, "Enter x");
                        System.out.println("log10(x) = " + log10(x));
                        break;
                    }
                    case "16": {
                        double x = readDouble(input, "Enter x");
                        System.out.println("10^x = " + pow(10, x));
                        break;
                    }
                    case "17": {
                        double deg = readDouble(input, "Enter angle (degrees)");
                        System.out.println("sin(" + deg + "°) = " + sin(toRadians(deg)));
                        break;
                    }
                    case "18": {
                        double deg = readDouble(input, "Enter angle (degrees)");
                        System.out.println("cos(" + deg + "°) = " + cos(toRadians(deg)));
                        break;
                    }
                    case "19": {
                        double deg = readDouble(input, "Enter angle (degrees)");
                        System.out.println("tan(" + deg + "°) = " + tan(toRadians(deg)));
                        break;
                    }
                    case "20": {
                        double deg = readDouble(input, "Enter angle (degrees)");
                        double t = tan(toRadians(deg));
                        if (t == 0.0) System.out.println("cot undefined at " + deg + "°");
                        else          System.out.println("cot(" + deg + "°) = " + (1.0 / t));
                        break;
                    }
                    case "21": {
                        double deg = readDouble(input, "Enter angle (degrees)");
                        double c = cos(toRadians(deg));
                        if (c == 0.0) System.out.println("sec undefined at " + deg + "°");
                        else          System.out.println("sec(" + deg + "°) = " + (1.0 / c));
                        break;
                    }
                    case "22": {
                        double deg = readDouble(input, "Enter angle (degrees)");
                        double s = sin(toRadians(deg));
                        if (s == 0.0) System.out.println("csc undefined at " + deg + "°");
                        else          System.out.println("csc(" + deg + "°) = " + (1.0 / s));
                        break;
                    }
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                input.nextLine(); // clear any bad input
            }
        }
    }
}

