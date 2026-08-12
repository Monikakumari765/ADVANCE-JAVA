import java.util.*;

public class flatmap {
    public static void main(String[] args) {

        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        numbers.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
    }
}