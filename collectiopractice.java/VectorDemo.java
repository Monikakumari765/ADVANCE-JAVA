import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        
        Vector<Integer> vector = new Vector<>();   // Create a vector to hold Integer values

        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Display the vector
        System.out.println("Vector: " + vector);

        // Access an element at a specific index
        System.out.println("Element at index 1: " + vector.get(1));

        // Remove an element from the vector
        vector.remove(0);
        System.out.println("Vector after removing element at index 0: " + vector);

        // Check if the vector contains a specific element
        System.out.println("Does the vector contain 20? " + vector.contains(20));

        // Get the size of the vector
        System.out.println("Size of the vector: " + vector.size());
    }
}