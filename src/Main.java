import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " - Capacity: " + capacity);
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse UC7/UC8)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("Sleeper", 70));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 60));

        // Step 2: Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogieList
                .stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (String key : groupedBogies.keySet()) {
            System.out.println("Type: " + key);

            for (Bogie b : groupedBogies.get(key)) {
                b.display();
            }
            System.out.println();
        }

        // Step 4: Show original list unchanged
        System.out.println("Original Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}