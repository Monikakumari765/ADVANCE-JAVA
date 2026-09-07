public class uphillpattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++)
         {
            // spaces ke liye loop
            for (int j = i; j <= n; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("* ");
            }
            for(int l=2; l<=i; l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
