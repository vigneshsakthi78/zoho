public class OrderagnosticBS {
    public static void main(String[] args) {

        int []arr={11,11,6,6,5,4,3};
        int target=6;
        int ans=orderagnosticBS(arr,target);
        System.out.println(ans);
    }

static int orderagnosticBS(int[]arr,int target)
{
    int start=0;
    int end=arr.length-1;
    boolean isAsc=arr[start]<arr[end];

    while(start<=end) {
        int mid=start+(end-start)/2;
        if (arr[mid]==target) {
            return mid;
        }
        if(isAsc){
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else
            {
                end=mid-1;
            }
        }
        else
        {
            if (arr[mid] > target) {
                start = mid + 1;
            }
            else
            {
                end=mid-1;
            }
        }


    }
    return -1;
}}
