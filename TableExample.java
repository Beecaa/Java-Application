public class TableExample {
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s %-10s%n", "ID", "Name", "Score");

        int[] ids = {101, 102, 103}; // stores a list of integer value(int []) arrays of integer(ids)
        String[] names = {"Alice", "Bob", "Charlie"}; // stores a list of string(string [] names) arrays of strings(names)
        int[] scores = {95, 87, 78}; // stores a list of integer value(int [] scores)  arrays of integer(scores)

        for (int i = 0; i < ids.length; i++) {
            System.out.printf("%-10d %-15s %-10d%n", ids[i], names[i], scores[i]);
        }
    }


}