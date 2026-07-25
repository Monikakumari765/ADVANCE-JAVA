import java.util.*;

public class Main7 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");

        for(String s : set){
            System.out.println(s);
        }
    }
}