import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) { //Keep playing until the user doesn't want to anymore
            int secretNumber = random.nextInt(1000) + 1; // Generates a random number between 1 and 1000
            int guess;
            int numGuesses = 0;

            System.out.println("Guess a number between 1 and 1000.");

            do {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                numGuesses++;

                if (guess < secretNumber) {
                    System.out.println("Too low. Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high. Try again.");
                }
            } while (guess != secretNumber);

            System.out.println("Congratulations! You guessed the number in " + numGuesses + " tries!");

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = input.next();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}