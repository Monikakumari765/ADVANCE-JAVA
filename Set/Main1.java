
import java.util.*;

public class Main1{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(20); // Duplicate
        set.add(30);

        System.out.println(set);
    }
}