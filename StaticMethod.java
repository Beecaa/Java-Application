import java.util.Scanner;

public class StaticMethod {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// calling static methods
		StaticMethod.sum();
		StaticMethod.divide(90,70);
		System.out.println(StaticMethod.product());
		
		System.out.print("enter full name: ");
		String name = scan.nextLine ();
		
		System.out.println(StaticMethod.personName(name)); // name is the argument
		
	
		
	}
	public static void sum(){    // void won't return anything. static method without parameters and no return type
		int x = 50;
		int y = 30;
		int total = x + y;
		System.out.printf("Sum of the two number is %d%n", total);
	}
	public static void divide(int x, int y){ // static method with two parameters and no return type
		double total =(double) x/y; // typecasting
		System.out.printf("the second sum of the two number is %f%n", total);
	}	
	public static int product(){ // static method with a return value integer without parameters 
		int x = 60;
		int y = 10;
		int mul;
		return mul = x * y; // if this return is skipped it wont run because it is returning  
	}	
	public static String personName(String fullName){ //static method with a return value string with parameters, fullname is the parameter
		return fullName;
		
	}
}

//*methods cannot be created in the method 
//methods are created outsise and called in the main method
// local variables are accessed only within a block
// arguments are the values passed into the parameters created in the variable
//parameters are variables created in the method
// static method belongs to the class rather than instances of the class