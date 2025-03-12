public class Numberpattern {
    public static void main(String[] args) {
pattern(7);
    }
    static void pattern(int n) {
        for (int i = n; i >1; i--) {
         /*for (int k = n; k >i; k--) {
              System.out.print(" ");
            }*/
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

         /* for (int row = 0; row <=n; row++)
            {
                for (int i =n+1; i >row; i--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }*/
    }
}
