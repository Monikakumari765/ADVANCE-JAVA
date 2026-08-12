import java.util.*;

public class peek {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        numbers.stream()
                .peek(n -> System.out.println("Before: " + n))
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}