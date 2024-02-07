import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int userNumber = 0;

        System.out.println("Give me a number and I'll tell you if it's even or odd.");
        userNumber = userInput.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
