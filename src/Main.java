import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;   // Cylindrical, Rectangular, etc.
    String cargo;  // Petroleum, Coal, Grain, etc.

    // Constructor
    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Display method
    void display() {
        System.out.println(type + " Bogie - Cargo: " + cargo);
    }
}

public class TrainSafetyApp {
    public static void main(String[] args) {

        // Step 1: Create goods bogie list
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Rectangular", "Coal"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Step 2: Apply safety validation using allMatch()
        boolean isSafe = goodsList
                .stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum allowed
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                        b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        // Step 4: Display bogies
        System.out.println("\nGoods Bogies:");
        goodsList.forEach(GoodsBogie::display);
    }
}