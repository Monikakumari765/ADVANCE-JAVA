import java.util.*;

public class min{
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(30, 10, 40, 20);

        Optional<Integer> result = numbers.stream()
                .min(Integer::compareTo);

        System.out.println(result.get());
    }
}