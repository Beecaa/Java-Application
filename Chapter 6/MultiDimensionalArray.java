public class MultiDimensionalArray {

    public static void main(String[] args) {
        
	int[] [] num = {{3, 4, 5}, {4, 5, 6}, {7,8,9}};
	
	for(int row = 0; row < 3; row++)
	{
		for(int col = 0; col < 3; col++) {
			System.out.printf("element at index[%d] [%d] =%d%n", row, col, num [row][col]);  
		}
	}
	
 }
	
}
