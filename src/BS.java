public class BS {
    public static void main(String[] args) {
        int[]arr={1,6,7,8,9};
        int target=0;

        System.out.println(search(arr,target,0,arr.length)); 
    }
    static int search(int[]arr,int target,int s,int e)
    {
        //Base condition
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[m]>target)
        {
            return search(arr, target, s, m-1);
        }

return search(arr,target,m+1,e);
    }
}
