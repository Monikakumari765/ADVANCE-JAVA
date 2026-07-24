import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");

        System.out.println(set.contains("Java"));
        System.out.println(set.contains("C++"));
    }
}
