public class ReverseInRecursion {
    public static void main(String[] args) {
        int n=1700;

        System.out.println( recursion(n));
    }
    static int reverse(int n)
    {
        int sum=0;
        int digit=10;
        while(n>0)
        {
            int rem=n%10;
            sum=sum*digit+rem;
            n/=10;
        }
        return sum;
    }
    static int sum=0;
    static void rec(int n)
    {
        if(n==0)
        {
            return;
        }
        int digit=10;
        int rem=n%10;
        sum=sum*digit+rem;
         rec(n/10);
    }
    static int recursion(int n)
    {
        int temp=n;
        int count=0;
        while(temp>0)
        {
            count++;
           temp/=10;
        }
        int digits=count;
        return helper(n,digits);
    }
    static int helper(int n,int digits)
    {
        int rem=n%10;
        if (rem==n)
        {
            return n;
        }
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
