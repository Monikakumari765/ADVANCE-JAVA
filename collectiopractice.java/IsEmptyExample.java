import java.util.HashSet;

public class IsEmptyExample {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        System.out.println(set.isEmpty());

        set.add(100);

        System.out.println(set.isEmpty());
    }
}