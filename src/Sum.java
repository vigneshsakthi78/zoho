public class Sum {
    public static void main(String[] args) {
        int n=1034;
        System.out.println(sumOfDigits(n));
        /* int sum=0;
       while(n>0)
        {

            int digits=n%10;
            sum=sum+digits;
            n/=10;

        }
        System.out.println(sum);*/
    }
    static int sumOfDigits(int n)
    {
        /*if (n == 0) {
            return 1;
        }*/
        if (n%10 == n) {
            return n;
        }
        //productof digits
       return sumOfDigits(n/10)*(n%10);
       // return sumOfDigits(n/10)+(n%10);
    }

}
