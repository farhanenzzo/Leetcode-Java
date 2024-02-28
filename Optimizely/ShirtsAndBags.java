package Optimizely;

import java.util.HashMap;
import java.util.Map;

public class ShirtsAndBags {
    public static void main(String[] args) {
        int shirtQuantity = 10;
        int bagNumber = 10;
        int bagCapacity = 10;

        // Create a map to hold bags
        Map<String, Map<String, Integer>> bags = new HashMap<>();

        // Create 10 bags
        for (int i = 1; i <= 10; i++) {
            String bagName = "Bag" + i;
            Map<String, Integer> bagItems = new HashMap<>();

            // Set the capacity of each bag to 10
            for (int j = 1; j <= 10; j++) {
                String item = "Item" + j;
                // You can initialize the items in the bag with some default value or leave them as 0
                bagItems.put(item, 0);
            }

            // Add the bag to the bags map
            bags.put(bagName, bagItems);
        }

        // Distribute 10 shirts evenly among the bags
        distributeShirts(bags, 10);

        // Print the bags
        for (Map.Entry<String, Map<String, Integer>> entry : bags.entrySet()) {
            String bagName = entry.getKey();
            Map<String, Integer> bagItems = entry.getValue();

            System.out.println("Bag: " + bagName);

            for (Map.Entry<String, Integer> itemEntry : bagItems.entrySet()) {
                String itemName = itemEntry.getKey();
                int itemCount = itemEntry.getValue();

                System.out.println("  " + itemName + ": " + itemCount);
            }
        }
    }

    // Distribute shirts evenly among the bags
    private static void distributeShirts(Map<String, Map<String, Integer>> bags, int totalShirts) {
        int bagsCount = bags.size();
        int shirtsPerBag = totalShirts / bagsCount;
        int remainingShirts = totalShirts % bagsCount;

        int shirtNumber = 1;

        for (Map<String, Integer> bagItems : bags.values()) {
            for (String item : bagItems.keySet()) {
                if (shirtNumber <= shirtsPerBag) {
                    bagItems.put(item, 1); // Each shirt is represented by the value 1
                    shirtNumber++;
                } else if (remainingShirts > 0) {
                    bagItems.put(item, 1);
                    remainingShirts--;
                    shirtNumber++;
                } else {
                    break;
                }
            }
        }
    }
}
