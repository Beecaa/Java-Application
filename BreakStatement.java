  public class BreakStatement{
	public static void main(String[]args){
		for (int i = 1; i <= 10; i++){
			
			if (i == 6)
				break;
			System.out.printf("%d%n" , i);
		}
        System.out.println("this is the end of the loop");
	
	}	
}