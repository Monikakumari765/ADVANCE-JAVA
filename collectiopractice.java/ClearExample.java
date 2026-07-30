import java.util.HashSet;

public class ClearExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Before clear: " + set);

        set.clear();

        System.out.println("After clear: " + set);
    }
}