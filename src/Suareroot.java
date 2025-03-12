public class Suareroot {
    public static void main(String[] args) {
        int n = 16;
        int a = sqrtOfaNo(n);
        System.out.println("Square root of " +n+" is "+a);
    }

    static int sqrtOfaNo(int n) {
        for (int i = 0; i <= n; i++) {
            int s = i * i;
            if (s == n) {
                return i;
            }


        }
        return -1;
    }
}
