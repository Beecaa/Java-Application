 import java.util.Scanner;
 
 public class DoWhileLoop{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int score;               // Variable to store each score input by the user
        int sumofscore = 0;      // Variable to store the sum of all scores (initialized to 0)
        double average;          // Variable to store the average of the scores
        int i = 1;               // Counter variable to track the number of inputs
		
		
		do{
			
			System.out.print("enter score: "); // prompts the user to enter score
			score = scan.nextInt(); // Reads the user's input and stores it in the 'score' variable
			sumofscore += score; // Adds the score entered by the user to 'sumofscore
			i++;  // Increments the counter 'i' by 1

		}while(i <= 10); // The loop continues until 'i' exceeds 10 (i.e., after 10 scores are entered)

		
		average = (double)sumofscore/10;  // explicitly casts sumofscore to double for accurate division
		System.out.printf("the score average is % .2f", average);  // Prints the average with 2 decimal places
    }
		
		
	}		
}