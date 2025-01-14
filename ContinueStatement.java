  public class ContinueStatement{
	public static void main(String[]args){
		
		int i = 0;  
		
		while(i <= 10) {
			
			i++;
			if (i == 5) // when i == 5 skip printing 5 and continue with 6
				continue;
			System.out.printf("%d%n" ,i);
			
		}
        System.out.println("this is the end of the loop");
	
	}	
}