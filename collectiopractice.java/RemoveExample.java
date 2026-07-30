import java.util.HashSet;

public class RemoveExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        set.remove("Banana");

        System.out.println(set);
    }
}