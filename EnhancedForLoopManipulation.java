import java.util.Scanner

public class EnhancedForLoopManipulation {
    public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in)
		
		int[] numbers = new int [10]; 
		pro = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.print("enter number: ");
			numbers[i] = scan.nextInt();
			
			pro *= numbers [5];
			System.out.printf("the product of all the numbers is %d", pro);
		}
	}
}
			
		
		