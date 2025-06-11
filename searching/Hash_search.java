// Uses a hash function to directly compute the index of the target.

import java.util.HashMap;

public class Hash_search {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs
        HashMap<Integer, String> dataMap = new HashMap<>();

        // Inserting elements into the map
        dataMap.put(101, "Alice");
        dataMap.put(102, "Bob");
        dataMap.put(103, "Charlie");
        dataMap.put(104, "David");

        // Target key to search
        int targetKey = 103;

        // Hash-based search
        if (dataMap.containsKey(targetKey)) {
            System.out.println("Element found: " + dataMap.get(targetKey));
        } else {
            System.out.println("Element not found.");
        }
    }
}
