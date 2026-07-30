import java.util.HashSet;

public class IterateExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}