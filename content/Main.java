interface Robot {
    void work();
}

public class Main {

    public static void main(String[] args) {

        Robot r = () -> {
            System.out.println("Robot is Dancing");
        };

        r.work();
    }
}