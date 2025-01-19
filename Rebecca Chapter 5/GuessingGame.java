import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int guess;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
	

do {
    System.out.print("Guess a number: ");
    guess = scanner.nextInt();

    if (guess == 50) {
        System.out.print("You guessed correctly: ");
        break; // Exit the loop
    } else if (guess < 50) {
        System.out.println("Too low. Guess higher.");
    } else if (guess > 50) {
        System.out.println("Too high. Guess lower.");
    } else {
        System.out.println("Congratulations! You guessed the number.");
    }
	break;
} while (guess != numberToGuess);

scanner.close();

	}
}



















