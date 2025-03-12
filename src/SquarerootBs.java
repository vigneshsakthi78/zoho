public class SquarerootBs {
    public static void main(String[] args) {
        int n=100;
        int a=sqrtBs(n);
        System.out.println("Square root of "+n+" is "+a);
    }
    static  int sqrtBs(int n)
    {
        int start=0;
        int end=n;

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid*mid==n)
            {
                return mid;
            }
            if (mid*mid>n)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
       return -1;
    }
}
