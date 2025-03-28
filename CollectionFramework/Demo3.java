package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        Keys price1 = new Keys(100);
        Keys price2 = new Keys(200);
        Keys price3 = new Keys(300);
        Keys price4 = new Keys(400); // Duplicate key

        Map<Keys, String> products = new HashMap<>();
        products.put(price1, "Banana");
        products.put(price2, "Apple");
        products.put(price3, "Guava");
        products.put(price4, "Banana"); // Overwrites the previous "Banana" due to duplicate key

        System.out.println("Original Map: " + products);

        Map<Keys, String> uniqueProducts = removeDuplicates(products);

        System.out.println("Map after removing duplicates: " + uniqueProducts);
    }

    public static Map<Keys, String> removeDuplicates(Map<Keys, String> original) {
        // A set to track unique values
        HashSet<String> uniqueValues = new HashSet<>();

        // A map to store the filtered entries
        Map<Keys, String> filteredMap = new HashMap<>();

        for (Map.Entry<Keys, String> entry : original.entrySet()) {
            // If the value is not already in the set, add it to the filtered map
            if (uniqueValues.add(entry.getValue())) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredMap;
    }
}
