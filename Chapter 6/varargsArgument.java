

public class varargsArgument{
	public static void main (String args []){
		
		System.out.println(add(6,20,3,5,7,8,5,9));
		listOfNames("Martins", "Benjamin", "Frank","Louis");
	
	}
			
	
	public static int add(int...numbers){
		int sum = 0;
		
		for(int number : numbers){
			
			sum += number;
		}
		return sum;
	}
	public static void listOfNames(String...names){
		for (String name : names){
			System.out.printf("%s%n", name);
		}
	}
}
