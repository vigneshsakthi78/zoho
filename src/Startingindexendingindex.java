import java.util.Arrays;

public class Startingindexendingindex {
    public static void main(String[] args) {

        int[]nums={1,3,4,4,4,5,5,5,5,6,7};
        int target=4;
int []ans=search(nums,target);
        System.out.println(Arrays.toString(ans ));
    }
    public static int [] search(int[]nums,int target) {

        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    public static int search(int[]nums,int target,boolean firstindex)
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if (nums[mid] < target) {
                start = mid + 1;
            }
            else if (nums[mid]>target)
            {
                end=mid-1;
            }
            else{
                ans=mid;
                if(firstindex)
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
