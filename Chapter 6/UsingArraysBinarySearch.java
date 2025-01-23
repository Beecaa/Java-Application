import java.util.Arrays;

public class UsingArraysBinarySearch{
	public static void main(String [] args){
		int [] numbers = {6,19,2,29,1,30,8,3,12,4};
		
		//arrays.sort(numbers)...sort method
		Arrays.sort(numbers); //Arrays.sort(numbers,4,9); for an index sorting
		
		for(int element : numbers){
			System.out.printf("%d%n", element);
		}
		System.out.println("===================================");
		
		//binary search method
		int index = Arrays.binarySearch(numbers,30);
		System.out.printf("The index numbers of 30 is %d%n", index);
		System.out.println("===================================");
		
		//Equals static method for coparing two arrays
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		boolean isEqual = Arrays.equals(arr1, arr2);
		
		System.out.printf("%b%n", isEqual);	
		
		System.out.println("===================================");
		
		//Fill method...used to fill an array
		int [] myArrays = new int [5];
		
		Arrays.fill(myArrays,20);
		
		for(int component : myArrays){
			System.out.printf("%d%n", component);
		}	
		System.out.println("===================================");
		
		// copy an arrays
		int [] original = {1,2,3};
		int copy = Arrays.copyOf(original, 5);
		
		for(int value : copy){
			System.out.printf("%d%n", value);
		}
		System.out.println("===================================");
		
		// converting arrays 
		String copyArray = Arrays.toString(copy);
		
		System.out.printf("%d%n", copyArray);
		System.out.println("===================================");
	}
}
		
		
		
