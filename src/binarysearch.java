public class binarysearch {
    public static void main(String[]args)
    {
        int []arr={1,6,7,8,9};
        int target=10;
        int ans=binary(arr,target);
        System.out.println(ans);
    }
    static int binary(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid]>target)
            {
                end=mid-1;
            }
            else if (arr[mid]==target) {
                return mid;
            }
        }
        return -1;
    }
}
