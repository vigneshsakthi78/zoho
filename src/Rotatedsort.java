public class Rotatedsort {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,2};
        int target=3;
        int peak=peak(arr);
        int firtry=binarySearch(arr,target,0,peak);
        if (firtry != -1) {
            System.out.println(firtry);
        }
        System.out.println(binarySearch(arr,target,peak+1,arr.length-1));

    }
    public static int peak(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
    public static int binarySearch(int[]arr,int target,int start,int end)
    {
        boolean isAsc=(arr[start]<arr[end]);
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(arr[mid]>target)
                {
                    start=mid+1;
                }
            else
                {
                    end=mid-1;
                }
            }
            else
            {
                if (arr[mid] < target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
return -1;
    }
}

