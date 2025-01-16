import java.util.Scanner;


public class UserInputSingleArray {
    public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String[] names = new String [5];
		
		
		for(int i = 0; i < 5; i++) {
			
			System.out .print("Enter name: ");
			names[i] = scan.nextLine();
		}
		for(int i = 0; i < 5; i++) {
				
			System.out .printf("Elements at index %d is =%s%n", i, names[i]);
			
		}
		
	}

}