import java.util.Deque;
import java.util.LinkedList;

public class Main21 {
    public static void main(String[] args) {

        // Create a Deque
        Deque<Integer> dq = new LinkedList<>();

        // Add elements
        dq.addFirst(20);
        dq.addFirst(10);
        dq.addLast(30);
        dq.addLast(40);

        // Display Deque
        System.out.println("Deque: " + dq);

        // Remove elements
        dq.removeFirst();
        dq.removeLast();

        // Display after removal
        System.out.println("After removing first and last: " + dq);

        // Peek elements
        System.out.println("First Element: " + dq.peekFirst());
        System.out.println("Last Element: " + dq.peekLast());
    }
}