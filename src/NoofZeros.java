public class NoofZeros {
    public static void main(String[] args) {
        int n=1000034000;
       /* int count =0;
        while(n>0)
        {
        int rem=n%10;

        if(rem==0)
        {
            count++;
        }
        n=n/10;

        }*/
        System.out.println(recCount(n));
    }
    static int recCount(int n)
    {
        return helper(n,0);
    }
    static int helper(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        int rem=n%10;
        if(rem==0)
        {
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
