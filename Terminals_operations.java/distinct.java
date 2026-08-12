import java.util.*;

public class distinct {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 30, 40);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}