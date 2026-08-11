import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int n : nums) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}