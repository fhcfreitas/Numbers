import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userNumber = 0;

        System.out.println("Digite um número:");
        userNumber = userInput.nextInt();

        if (userNumber > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}