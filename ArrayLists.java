import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s %-10s%n", "ID", "Name", "Score");

        List<Integer> ids = new ArrayList<>();
        ids.add(101);
        ids.add(102);
        ids.add(103);

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        List<Integer> scores = new ArrayList<>();
        scores.add(95);
        scores.add(87);
        scores.add(78);

        for (int i = 0; i < ids.size(); i++) {
            System.out.printf("%-10d %-15s %-10d%n", ids.get(i), names.get(i), scores.get(i));
        }
    }
}
