import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number, guessingNum = 5;
        System.out.println("Welcome to the number guessing game");
        do {
            System.out.print("Please guess the number between 0 - 10: ");
            Number = input.nextInt();
        }while(!(guessingNum == Number));
        System.out.println("You have successfully guessed the number");
    }
}
