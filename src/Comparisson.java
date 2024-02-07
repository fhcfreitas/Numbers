import java.util.Scanner;

public class Comparisson {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int number1 =  userInput.nextInt();

        System.out.println("Digite o segundo número:");
        int number2 =  userInput.nextInt();

        if (number1 == number2) {
            System.out.println("Both numbers are the same.");
        } else if (number1 > number2) {
            System.out.println("Number 1 is greater than number 2.");
        } else {
            System.out.println("Number 2 is greater than number 1.");
        }
    }
}
