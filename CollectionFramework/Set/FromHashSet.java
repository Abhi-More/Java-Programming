
// Set is unordered collection of unique elements
import java.util.Set;
import java.util.HashSet;
public class FromHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Abhishek");
        set.add("Saish");
        set.add("Gopal");
        set.add("Abhishek");

        System.out.println(set);
        
        // remove element by passing element
        set.remove("Abhishek");
        System.out.println(set);

        // Checking element present in set or not
        System.out.println("Abhishek is present: " + set.contains("Abhishek"));

        System.out.println("Size of set: " + set.size());
    }
}
