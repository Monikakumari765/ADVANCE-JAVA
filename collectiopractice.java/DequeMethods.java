import java.util.*;

public class DequeMethods {

    public static void main(String[] args) {

        // Create Deque
        Deque<Integer> dq = new ArrayDeque<>();

        // =====================================================
        // INSERT METHODS
        // =====================================================

        dq.addFirst(20);      // Front
        dq.addLast(30);       // Rear

        dq.offerFirst(10);    // Front
        dq.offerLast(40);     // Rear

        System.out.println("Deque : " + dq);

        // Output:
        // [10, 20, 30, 40]

        // =====================================================
        // ACCESS METHODS
        // =====================================================

        System.out.println("First : " + dq.getFirst());

        System.out.println("Last : " + dq.getLast());

        System.out.println("Peek First : " + dq.peekFirst());

        System.out.println("Peek Last : " + dq.peekLast());

        // =====================================================
        // REMOVE METHODS
        // =====================================================

        System.out.println("Remove First : " + dq.removeFirst());

        System.out.println("Remove Last : " + dq.removeLast());

        System.out.println("After Remove : " + dq);

        // =====================================================
        // POLL METHODS
        // =====================================================

        System.out.println("Poll First : " + dq.pollFirst());

        System.out.println("Poll Last : " + dq.pollLast());

        // =====================================================
        // ADD SOME VALUES AGAIN
        // =====================================================

        dq.add(100);
        dq.add(200);
        dq.add(300);

        // =====================================================
        // GENERAL METHODS
        // =====================================================

        System.out.println("Size : " + dq.size());

        System.out.println("Contains 200 : " + dq.contains(200));

        System.out.println("Is Empty : " + dq.isEmpty());

        // =====================================================
        // ITERATION
        // =====================================================

        System.out.print("Forward : ");

        for(Integer x : dq)
            System.out.print(x + " ");

        System.out.println();

        // Reverse Traversal

        System.out.print("Reverse : ");

        Iterator<Integer> it = dq.descendingIterator();

        while(it.hasNext())
            System.out.print(it.next() + " ");

        System.out.println();

        // =====================================================
        // CLEAR
        // =====================================================

        dq.clear();

        System.out.println("After Clear : " + dq);
    }
}