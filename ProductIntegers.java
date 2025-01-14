import java.util.Scanner;

public class ProductIntegers{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		
		int x;
		int y;
		int z;
		
	System.out.print("Enter first integer: ");
		x = input.nextInt();	
		
		
		System.out.print("Enter second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter third integer: ");
		z = input.nextInt();
		
		
		int multiplication = x*y*z;
		
		System.out.printf("the product of the number is %d",multiplication);
		input.close();
		}
}	
