import java.util.HashSet;

public class ContainsExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");

        System.out.println(set.contains("Banana"));
        System.out.println(set.contains("Mango"));
    }
}