/* map is used to store key-value pairs
  Technically it is not a part of collection framework because it is not extended from Collections
 */

import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding elements to the hashmap using put() method.
        map.put("Abhishek", 190);
        map.put("Sandip", 100);
        map.put("Ashutosh", 45);
        map.put("Saish", 50);
        map.put("Sahil", 590);

        System.out.println("Map: " + map);

        //Set of values
        Set setOfKeys=map.keySet();
        System.out.println("Set of values: " + setOfKeys);
        
        // Collection of values
        Collection collectionValues=map.values();
        System.out.print("Collection of values: " + collectionValues);
        
        // Geting value by passing key
        System.out.println("Abhishek: " + map.get("Abhishek"));
        
        // Check key present or not
        System.out.println("Abhishek is present: " + map.containsKey("Abhishek"));
        
        // Overwrites value for same key, duplicate keys are not allowed
        map.put("Abhishek", 1000);
        System.out.println("Abhishek: " + map.get("Abhishek"));
        
        // Adds key if it is not present in map
        map.putIfAbsent("Abhishek", 50);
        System.out.println("Map: " + map);

        // Iterating each entry in map
        System.out.println("\nAll Entries\n");
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.print(entry.getKey() + ": " + entry.getValue() + "\n");
        }  
    }
}
