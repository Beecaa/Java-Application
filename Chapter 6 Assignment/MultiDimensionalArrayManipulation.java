public class MultiDimensionalArrayManipulation {

    public static void main(String[] args) {

        int[][] num = {
            {3, 4, 5},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < 3; row++) { // Iterate through rows
            for (int col = 0; col < num[row] 3; col++) { // Iterate through columns in current row
                System.out.printf("Element at index [%d][%d] = %d%n", row, col, num[row][col]);
            }
        }
    }
}