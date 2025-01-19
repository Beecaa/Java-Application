import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberModified {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
			int secretNumber = 709;
            
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

            if (numGuesses <= 10) {
                if(numGuesses == 10) {
                    System.out.println("Aha! You know the secret!");
                } else {
                    System.out.println("Either you know the secret or you got lucky!");
                }
            } else {
                System.out.println("You should be able to do better!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = input.next();
            playAgain = playChoice.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}