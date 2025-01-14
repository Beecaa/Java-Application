public class TypeCasting{
	public static void main(String[] args){
		// widening(implicit) from int to double
		int num1 = 100;
		double d = (double) num1;
		
		System.out.println(d);
		
		// narrowing(explicit) from long to int
		long longValue = 1000000000L;
		int intValue = (int) longValue;
		
		System.out.println(intValue);
		
		// explicit conversion but data would be lost
		double num = 100.99;
		int i = (int) num;
		
		System.out.println(i);
	}
}