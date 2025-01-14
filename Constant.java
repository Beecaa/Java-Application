// create a class called constant and with a static variable pi initialized to the value of pie 
//create a method to calculate the area of the circle with radius inputed by the user.

import java.util.Scanner;

public class Constant {
	static final double pi = 3.142; // final keyword shows you cant make changes because its a constant value
	
	static int age= 50;
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		int radius = scanner.nextInt();
			Constant.check();
		Constant.area(radius); // because its a static method we use the class name and it takes one parameter
		
	}
	
	public static void area (int radius){
		double areaOfCircle = pi * radius * radius;
		System.out.printf("the area of the circle is %.2f", areaOfCircle);
		
		
		public static void check (){
			if (age >= 18)
				System.out.println("you are an adult");
			
			else
				System.out.println("you are a teenager")
	}
}
//import java.util.Random;

		




















/* write a java program to create a class called bank acoount with variable account number, balance 
/and intrest rate. provide static methods to get and set the static variables create several bank account objects and print their details along with static variables 