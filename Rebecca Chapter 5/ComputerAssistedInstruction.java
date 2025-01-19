import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueLearning;

        do {
            int correctAnswers = 0;
            int totalQuestions = 10;

            System.out.println("Welcome to the Computer-Assisted Instruction Program!");
            System.out.println("You will be asked 10 questions. Please answer them correctly.");

            for (int i = 0; i < totalQuestions; i++) {
                int number1 = random.nextInt(10); // Random number between 0 and 9
                int number2 = random.nextInt(10); // Random number between 0 and 9
                int correctAnswer = number1 + number2;

                System.out.printf("Question %d: What is %d + %d? ", (i + 1), number1, number2);
                int studentAnswer = scanner.nextInt();

                if (studentAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
                }
            }

            // Calculate the percentage of correct answers
            double percentageCorrect = (double) correctAnswers / totalQuestions * 100;

            // Provide feedback based on the percentage
            if (percentageCorrect < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }

            // Ask if the user wants to try again
            System.out.print("Do you want to try again? (yes/no): ");
            String response = scanner.next();
            continueLearning = response.equalsIgnoreCase("yes");

        } while (continueLearning);

        System.out.println("Thank you for participating!");
        scanner.close();
    }
}