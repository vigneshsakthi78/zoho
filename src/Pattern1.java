public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        pattern(n);
    }
    static void pattern(int n)
    {
        for (int i = 1; i < n; i++) {
           /* for (int k = n; k >i; k--) {
              System.out.print("  ");
            }*/
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <n; i++) {
            for (int j =n; j >i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
            /*for (int row = 0; row <=n; row++)
            {
                for (int i =n+1; i >row; i--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }*/
    }
    }

