import java.util.*;

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

        // Step 1: Create list to store bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Sort bogies based on capacity (ascending)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies sorted by capacity (Ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Optional: Sort in descending order
        bogieList.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nBogies sorted by capacity (Descending):");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}