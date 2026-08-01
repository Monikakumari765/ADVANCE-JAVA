/*Stores unique elements (no duplicates)
 Stores elements in sorted (ascending) order
 Uses a Red-Black Tree internally
 Does not maintain insertion order
 Does not allow null (in modern Java versions)
Time Complexity:
add() → O(log n)
remove() → O(log n)
contains() → O(log n) */


import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetMethodsDemo {

    public static void main(String[] args) {

        // ==========================================
        // Creating TreeSet
        // ==========================================
        TreeSet<Integer> set = new TreeSet<>();

        System.out.println("Initial TreeSet : " + set);

        // ==========================================
        // 1. add()
        // ==========================================
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println("\nAfter add() : " + set);

        // Duplicate ignored
        set.add(20);

        System.out.println("After adding duplicate 20 : " + set);

        // ==========================================
        // 2. size()
        // ==========================================
        System.out.println("\nSize : " + set.size());

        // ==========================================
        // 3. contains()
        // ==========================================
        System.out.println("\nContains 30 : " + set.contains(30));
        System.out.println("Contains 100 : " + set.contains(100));

        // ==========================================
        // 4. remove()
        // ==========================================
        System.out.println("\nBefore remove() : " + set);

        set.remove(20);

        System.out.println("After remove(20) : " + set);

        // ==========================================
        // 5. isEmpty()
        // ==========================================
        System.out.println("\nIs Empty : " + set.isEmpty());

        // ==========================================
        // 6. iterator()
        // ==========================================
        System.out.println("\nIterator Output");

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        // ==========================================
        // 7. for-each Loop
        // ==========================================
        System.out.println("\nFor-Each Loop");

        for(Integer num : set){
            System.out.println(num);
        }

        // ==========================================
        // 8. clone()
        // ==========================================
        TreeSet<Integer> copy =
                (TreeSet<Integer>) set.clone();

        System.out.println("\nCloned TreeSet : " + copy);

        // ==========================================
        // 9. addAll()
        // ==========================================
        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(60);
        set2.add(50);

        System.out.println("\nSecond TreeSet : " + set2);

        set.addAll(set2);

        System.out.println("After addAll() : " + set);

        // ==========================================
        // 10. removeAll()
        // ==========================================
        TreeSet<Integer> removeSet = new TreeSet<>();

        removeSet.add(30);
        removeSet.add(50);

        System.out.println("\nBefore removeAll() : " + set);

        set.removeAll(removeSet);

        System.out.println("After removeAll() : " + set);

        // ==========================================
        // 11. retainAll()
        // ==========================================
        TreeSet<Integer> retainSet = new TreeSet<>();

        retainSet.add(10);
        retainSet.add(60);

        System.out.println("\nBefore retainAll() : " + set);

        set.retainAll(retainSet);

        System.out.println("After retainAll() : " + set);

        // ==========================================
        // 12. equals()
        // ==========================================
        TreeSet<Integer> set3 = new TreeSet<>();

        set3.add(10);
        set3.add(60);

        System.out.println("\nSet : " + set);
        System.out.println("Set3 : " + set3);

        System.out.println("Equals : " + set.equals(set3));

        // ==========================================
        // 13. hashCode()
        // ==========================================
        System.out.println("\nHash Code : " + set.hashCode());

        // ==========================================
        // 14. toArray()
        // ==========================================
        Object[] arr = set.toArray();

        System.out.println("\nArray Elements");

        for(Object x : arr){
            System.out.println(x);
        }

        // ==========================================
        // 15. first()
        // ==========================================
        System.out.println("\nFirst Element : " + set.first());

        // ==========================================
        // 16. last()
        // ==========================================
        System.out.println("Last Element : " + set.last());

        // ==========================================
        // 17. higher()
        // ==========================================
        System.out.println("\nHigher than 10 : " + set.higher(10));

        // ==========================================
        // 18. lower()
        // ==========================================
        System.out.println("Lower than 60 : " + set.lower(60));

        // ==========================================
        // 19. ceiling()
        // ==========================================
        System.out.println("\nCeiling of 15 : " + set.ceiling(15));

        // ==========================================
        // 20. floor()
        // ==========================================
        System.out.println("Floor of 55 : " + set.floor(55));

        // ==========================================
        // 21. pollFirst()
        // ==========================================
        System.out.println("\nRemoved First : " + set.pollFirst());

        System.out.println("After pollFirst() : " + set);

        // ==========================================
        // 22. pollLast()
        // ==========================================
        System.out.println("\nRemoved Last : " + set.pollLast());

        System.out.println("After pollLast() : " + set);

        // ==========================================
        // 23. clear()
        // ==========================================
        System.out.println("\nBefore clear() : " + set);

        set.clear();

        System.out.println("After clear() : " + set);

        // ==========================================
        // 24. isEmpty()
        // ==========================================
        System.out.println("\nIs Empty : " + set.isEmpty());
    }
} 
    