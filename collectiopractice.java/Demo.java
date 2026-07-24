import java.util.*;

public class Demo
{
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("Spring");

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.search("Java"));

        System.out.println(stack.empty());
    }
}