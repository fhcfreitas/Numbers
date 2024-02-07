import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number and I'll tell you the factorial of it: ");
        int userInput = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= userInput; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + userInput + " is: " + factorial);
    }
}
