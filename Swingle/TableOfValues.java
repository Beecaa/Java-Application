public class TableOfValues {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%n", "N", "10*N", "100*N", "1000*N"); // Table header
        System.out.println("-----------------------------");

        for (int i = 1; i <= 10; i++) {
            int tenthPlace = i * 10;
            int hundredTh = 100 * i;
			int thousandN = 1000 * i;
            System.out.printf("%-10d%-10d%-10d%n", i, tenthPlace, hundredTh,thousandN); // Print the row
        }
    }
}
