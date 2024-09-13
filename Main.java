import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                scanner.close();
                break;
            }

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + Calculator.add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result: " + Calculator.subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: " + Calculator.multiply(num1, num2));
                    break;

                case 4:
                    try {
                        System.out.println("Result: " + Calculator.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
