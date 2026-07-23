interface Robot {
    void work();
}

public class Anonymous {

    public static void main(String[] args) {

        Robot r = new Robot() {

            @Override
            public void work() {
                System.out.println("Robot is Dancing");
            }

        };

        r.work();
    }
}