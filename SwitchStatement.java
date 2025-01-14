import java.util.Scanner;

 public class SwitchStatement{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		String name;
		int score;
		
		System.out.print("enter name: ");
		name = input.nextLine();
		
		System.out.print("enter score: ");
		score = input.nextInt();		
		
		switch(score/10) {
			case 10: // 100 - 90
			case 9: // 89 - 90
			        System.out.println(name + " your grade is outstanding");
			        break;
			
			case 8: // 80 - 89
			case 7: // 70 - 79
			case 6: // 60 - 69
					System.out.println(name + " your grade is excellent");
			        break;
			
			case 5: // 50 - 59
			        System.out.println(name + " your grade is good");
					break;
			
			case 4: // 40 - 49
			        System.out.println(name + " your grade is average");
					break;
     		
       		case 3:
			case 2:
			case 1:
			case 0:
			       System.out.println(name + " your grade is very poor");
				   break;
			
			default: 
			       System.out.println("invalid input");
		}
		
	}
}
		