public class diamond {
    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            for (int l = 2; l <= i; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            for (int l = 2; l <= i; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}