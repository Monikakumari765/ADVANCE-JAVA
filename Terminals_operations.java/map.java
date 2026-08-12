import java.util.*;

public class map {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}