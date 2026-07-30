import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will not be added

        // Display HashSet
        System.out.println("HashSet: " + fruits);

        // Check if an element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Remove an element
        fruits.remove("Orange");

        // Display updated HashSet
        System.out.println("After removal: " + fruits);

        // Iterate through the HashSet
        System.out.println("Elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of HashSet
        System.out.println("Size: " + fruits.size());

        // Clear all elements
        fruits.clear();
        System.out.println("Is HashSet empty? " + fruits.isEmpty());
    }
}
