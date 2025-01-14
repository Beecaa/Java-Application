 import java.util.Scanner;
 
 public class ForLoop{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int score;
		int sumofscore = 0;
		double average;
		
		for(int i = 1; i<= 10; i++) {
			
			System.out.print("enter score: ");
			score = scan.nextInt();
			
			sumofscore += score;
		}
		
		
		average = (double)sumofscore/10; // we typecasting because we want to have decimal integers to show and not only the integer
		System.out.printf("the score average is % .2f", average);
		
		
	}		
}