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

        // Step 1: Create bogie list (reuse previous UCs)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Stream → map → reduce
        int totalSeats = bogieList
                .stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);     // sum all values

        // Step 3: Display total
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Step 4: Show original list unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}