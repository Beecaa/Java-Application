import java.util. Random;
public class RandomNumbers{
	public static void main(String args[]) {
		Random random = new Random(); 
		
		// Create a variable to store the random number generated.
		int randomNum = random.nextInt();
		
		// Print your random numbers
		
		System.out.printf("Random Number is: %d%n",randomNum);
		
		//Generating a number within a range
		int randomNumInRange = random.nextInt(20) + 1;
		
		System.out.printf("Random Number in Range is: %d%n",randomNumInRange);
		
		// Generating a float point number
		double randomFloatNum = random.nextDouble();
		
		System.out.printf("Random Double in Range is: %.2f%n",randomFloatNum);
		
		// Generating a float point value within a range
		double min = 10.0;
		double max = 20.0;
		double randomFloatPointInRange = min + (max - min)* random.nextDouble();
		
		System.out.printf("Random Double Number in Range is: %.2f%n",randomFloatPointInRange);
		
		//Generating a Random Boolean Value
		boolean randomBooleanValue = random.nextBoolean();
		System.out.printf("Random Boolean value is: %b%n",randomBooleanValue );
		
		
		
		
	}
}	
	