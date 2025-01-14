import java.util.Scanner;

public class ArithmeticAssign{
	public static void main(String[]args){
		Scanner integer = new Scanner(System.in);
		
		
		int x;
		int y;
		
		
		System.out.print("Enter first integer: ");
		x = integer.nextInt();	
		
		
		System.out.print("Enter second integer: ");
		y = integer.nextInt();
		
		
		int sum = x + y;
		System.out.println(sum);
		
		
		int multiplication = x * y;
		System.out.println(product);
		
		
		int subtraction = x - y;
		System.out.println(difference);
		
		
		double division = x / y;
		System.out.println(division);	
		
		
		integer.close();
		}
}	
	