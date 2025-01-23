import java.util.Arrays;


public class UsingArraysClass {

    public static void main(String[] args) {
		int [] numbers = {6, 19, 2 ,29, 1, 10, 30, 5, 3, 12, 4};
	
	    Arrays.sort(numbers, 4, 9);
		
		for(int element : numbers){
			
			System.out.printf("%d%n", element);
		}
	}
}
		
