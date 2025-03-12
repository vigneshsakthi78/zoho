
public class Nopatterndiiff {
    public static void main(String[] args) {
        pattern(7);
    }
    static void pattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
           /* for (int k = n; k >i; k--) {
              System.out.print("  ");
            }*/
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j +" ");
            }
            for (int k = i-1; k >=1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
