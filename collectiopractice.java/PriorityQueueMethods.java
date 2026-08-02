
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMethods {

    public static void main(String[] args) {

        // ==========================================================
        // 1. CREATE PRIORITY QUEUE (Min Heap - Default)
        // ==========================================================
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // ==========================================================
        // 2. add(E e)
        // Adds an element (throws exception if insertion fails)
        // Time: O(log n)
        // ==========================================================
        pq.add(40);
        pq.add(10);
        pq.add(30);

        // ==========================================================
        // 3. offer(E e)
        // Adds an element (returns false if insertion fails)
        // Time: O(log n)
        // ==========================================================
        pq.offer(20);
        pq.offer(50);

        System.out.println("Queue : " + pq);

        // ==========================================================
        // 4. peek()
        // Returns smallest element without removing it
        // Returns null if queue is empty
        // Time: O(1)
        // ==========================================================
        System.out.println("Peek : " + pq.peek());

        // ==========================================================
        // 5. poll()
        // Removes and returns smallest element
        // Returns null if queue is empty
        // Time: O(log n)
        // ==========================================================
        System.out.println("Poll : " + pq.poll());

        System.out.println("After Poll : " + pq);

        // ==========================================================
        // 6. remove()
        // Removes head element
        // Throws NoSuchElementException if empty
        // Time: O(log n)
        // ==========================================================
        System.out.println("Remove Head : " + pq.remove());

        System.out.println("After Remove : " + pq);

        // ==========================================================
        // 7. remove(Object o)
        // Removes a specific element
        // Returns true if found
        // Time: O(n)
        // ==========================================================
        System.out.println("Remove 30 : " + pq.remove(Integer.valueOf(30)));

        System.out.println("After remove(30) : " + pq);

        // ==========================================================
        // 8. contains(Object o)
        // Checks if element exists
        // Time: O(n)
        // ==========================================================
        System.out.println("Contains 20 : " + pq.contains(20));

        // ==========================================================
        // 9. size()
        // Returns number of elements
        // Time: O(1)
        // ==========================================================
        System.out.println("Size : " + pq.size());

        // ==========================================================
        // 10. isEmpty()
        // Returns true if queue is empty
        // Time: O(1)
        // ==========================================================
        System.out.println("Is Empty : " + pq.isEmpty());

        // ==========================================================
        // 11. iterator()
        // Used to traverse the queue
        // NOTE: Order is NOT sorted!
        // ==========================================================
        System.out.print("Iterator : ");
        for (Integer num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ==========================================================
        // 12. clear()
        // Removes all elements
        // Time: O(n)
        // ==========================================================
        pq.clear();
        System.out.println("After Clear : " + pq);

        // ==========================================================
        // 13. Max Heap
        // Collections.reverseOrder() creates Max Heap
        // ==========================================================
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(40);

        System.out.println("\nMax Heap : " + maxHeap);
        System.out.println("Max Element : " + maxHeap.peek());

        // ==========================================================
        // 14. Printing Priority Queue in Sorted Order
        // (Queue becomes empty after polling)
        // ==========================================================
        System.out.print("Sorted Output : ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        // ==========================================================
        // 15. Common Methods Summary
        // ==========================================================
        /*
         * add(E e)            -> Insert element
         * offer(E e)          -> Insert element
         * peek()              -> View top element
         * poll()              -> Remove top element
         * remove()            -> Remove head
         * remove(Object o)    -> Remove specific element
         * contains(Object o)  -> Search element
         * size()              -> Number of elements
         * isEmpty()           -> Check if empty
         * clear()             -> Remove all elements
         * iterator()          -> Traverse queue (not sorted)
         */
    }
}