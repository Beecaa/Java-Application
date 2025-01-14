import java.util.Scanner;

public class UserInput{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		String name;
		
		
		System.out.print("Enter first number: ");
		num1 = scan.nextInt();	
		
		
		System.out.print("Enter second number: ");
		num2 = scan.nextInt();
		
		System.out.print("Enter third number: ");
		num3 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter name: ");
		name = scan.nextLine();
		
		int sum = num1 + num2 + num3;
		
		System.out.printf("%s the sum of the number is %d",name,sum);
		scan.close();
		}
}