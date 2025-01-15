// prompt a user to enter a random value and then the user should use input to generate a range 

import java.util. Random;
import java.util.Scanner;
public class RandomNum{
	public static void main(String args[]) {
		Random random = new Random();
        Scanner scan = new Scanner(System.in);		
		
		int upperLimit;
		
		System.out.printf("enter upper limit to be generated: ");
		upperLimit = scan.nextInt();
		
		if (upperLimit == 0){
			System.out.println("the number should be greater than zero");
		}
		else{
			int randomNum = random.nextInt(upperLimit) + 1;
			System.out.printf("the generated random number from 0 - %d is: %d%n", upperLimit,randomNum);
			
		}
	}
}