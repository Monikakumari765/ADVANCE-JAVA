import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);

        // contains()
        System.out.println(set.contains(20)); // true

        // size()
        System.out.println(set.size()); // 3

        // remove()
        set.remove(20);
        System.out.println(set); // [10, 30]

        // isEmpty()
        System.out.println(set.isEmpty()); // false

        // clear()
        set.clear();
        System.out.println(set.isEmpty()); // true
    }
}