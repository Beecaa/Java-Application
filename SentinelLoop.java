  import java.util.Scanner;
  public class SentinelLoop{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter numbers to sum (enter -1 to stop): ");
		int sum = 0;
		int number;
		
		
		// sentinel value is - 1
		while (true) {
			System.out.print("enter numbers: ");
			number = scanner.nextInt();
			
			if (number == -1){
				break;
			}
				sum += number;
		
		}
		
		System.out.printf("the total sum is: %d" + sum);
		scanner.close();		
		
	}
  }	