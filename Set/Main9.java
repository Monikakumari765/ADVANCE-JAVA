import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(10);
        set1.add(20);

        set2.add(30);
        set2.add(40);

        set1.addAll(set2);

        System.out.println(set1);
    }
}