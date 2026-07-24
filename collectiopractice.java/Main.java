import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored

        System.out.println(set);                  // Display Set
        System.out.println(set.contains(20));     // true
        System.out.println(set.size());           // 3

        set.remove(10);
        System.out.println(set);                  // [20, 30]

        System.out.println(set.isEmpty());        // false

        set.clear();
        System.out.println(set.isEmpty());        // true
    }
}
