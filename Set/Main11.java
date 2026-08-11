import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main11 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50, 60);

        Stream<Integer> evenNums = nums.stream().filter(n -> n > 25);

        evenNums.forEach(System.out::println);
    }
}
