import java.util.Scanner;


public class MethodOverloading {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("***********Menu**********");
		System.out.println("Enter 1 to calculate the perimeter of square");
		System.out.println("Enter 2 to calculate the perimeter of rectangle");
		int option = scan.nextInt();
		
		switch (option){
			case 1:
			{
							System.out.print("enter length of the square: ");
							int length = scan.nextInt();
							
							MethodOverloading.shape(length);
			}			
			break;
			
			case 2:
			{
							System.out.print("enter length of the rectangle: ");
							int length = scan.nextInt();
							
							System.out.print("enter breadth of the rectangle: ");
							int breadth = scan.nextInt();
							
							MethodOverloading.shape(length,breadth);
			}				
			break;
			
			default:
			System.out.println("Inavlid input");
		}
		
	}
	public static void shape(int length) {
		int perimeterOfSquare = 4*length;
		System.out.printf("the perimeter of the square is %d", perimeterOfSquare);
	}
	public static void shape (int length,int breadth){
		int perimeterOfRect = 2*length+breadth;
		
		System.out.printf("the perimeter of rectangle is %d",perimeterOfRect);
	}
}