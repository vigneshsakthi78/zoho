public class RBS {
    public static void main(String[] args) {
        int []arr={5,6,1,2,3};
        int target=5;
        int start=0;
        int end=arr.length-1;
        System.out.println( recursionSearch(arr, target, start, end));

    }
    static int recursionSearch(int []arr,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[s]<=arr[m])
        {
            if (target>=arr[s]&&target<=arr[m])
            {
                return recursionSearch(arr,target,s,m-1);
            }
            else
            {
                return recursionSearch(arr,target,m+1,e);
            }
        }
        if (arr[e]>=target && target>=arr[m])
        {
           return recursionSearch(arr,target,m+1,e);
        }
        return recursionSearch(arr,target,s,m-1);
    }
}

