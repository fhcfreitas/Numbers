import java.util.Scanner;
public class ChooseArea {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userAnswer = 0;

        System.out.println("Choose and option:");
        System.out.println("1. Calculate square area.");
        System.out.println("2. Calculate circle area.");
        System.out.println("3. Finish the program.");
        System.out.println("Choose an option:");

        userAnswer = userInput.nextInt();

        if (userAnswer == 1) {
            System.out.print("Digite o lado do quadrado: ");
            double side = userInput.nextDouble();
            double squareArea = side * side;
            System.out.println("Square Area: " + squareArea);
        } else if (userAnswer == 2) {
            System.out.print("Digite o raio do círculo: ");
            double radius = userInput.nextDouble();
            double circleArea = 3.14 * radius * radius;
            System.out.println("Circle Area: " + circleArea);
        } else if (userAnswer == 3) {
            System.out.println("Shutting down the program.");
        } else
            System.out.println("Invalid answer. Try again");
    }
}
