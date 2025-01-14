 import java.util.Scanner;
 
 public class WhileLoop{
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int score;
		int sumofscore = 0;
		double average;
		int i = 1;
		
		while(i <= 10) {
			
			System.out.print("enter score: ");
			score = scan.nextInt();
			
			sumofscore += score;
			i++;
		}	
		
		average = (double)sumofscore/10; 
		System.out.printf("the score average is % .2f", average);
		
		
	}		
}