import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int userNumber = 0;

        System.out.println("Choose a number and get the Multiplication Table:");
        userNumber = userInput.nextInt();

        System.out.println("Multiplication Table of" + userNumber + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(userNumber + "x" + i + "=" + (userNumber * i));
        }
    }
}
