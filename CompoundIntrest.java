 public class CompoundIntrest{
	public static void main(String[]args){
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		
		// formula A = p(1 + rate/n)
		
		System.out.printf("%-5s %-20s%n", "Year", "Amount on deposit");%
	
		for (int year = 1; year <= 10; ++year) {
			
			amount = principal * Math.pow(1.0 + rate, year); // Math.pow(1.0 + rate, year) raises (1 + 0.05) to the power of year.
		
		
			System.out.printf("%-5d % -20.2f%n", year, amount);
	// -5d Left-justifies the integer year within 5 spaces and ensures that all years from 1 to 10 align correctly in the first column.
	// %-20.2f Left-justifies the amount within 20 spaces and formats it to 2 decimal places (since money values usually require 2 decimal precision).
	// %n moves to the next line for iteration
	
		}
    }
}
	