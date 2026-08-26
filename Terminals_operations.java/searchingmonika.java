public class searchingmonika {
    public static void main(String[] args) {

        String[] studs = {"monika", "sneha", "priya", "anita", "neha"};

        for (int i = 0; i < studs.length; i++) {
            if (studs[i].equals("monika")) {
                System.out.println("Found monika at index: " + i);
                return;
            }
        }
        System.out.println("monika not found");
    }
}