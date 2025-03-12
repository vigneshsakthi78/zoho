public class Numberpat {
    public static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n)
    {
        /*
        for (int i = n; i >=1 ; i--) {
            for (int j = n; j>=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        o/p
         5
         5 4
         5 4 3
         5 4 3 2
         5 4 3 2 1  */
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
