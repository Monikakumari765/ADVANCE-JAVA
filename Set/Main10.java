import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        set2.add(10);
        set2.add(20);

        System.out.println(set1.containsAll(set2));
    }
}