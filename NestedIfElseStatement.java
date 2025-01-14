import java.util.Scanner;


public class NestedIfElseStatement{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int score;
		String name;
		
		System.out.print("enter your name: ");
		name = scan.nextLine();
		
		System.out.print("enter your score:");
		score = scan.nextnt();
		
		if(score >= 90)
			System.out.println(name + "your grade is outstanding");
		
		else if(score >= 75)
			System.out.print(name + "your grade is excellent");
		
		else if(score >= 55)
			System.out.print(name + "your grade is good");
		
		else if(score >= 45)
			System.out.print(name + "your grade is average");
		
		else
			System.out.print(name + "your grade is very very extremely bad");
		
	scan.close()		
		
		
	}
}