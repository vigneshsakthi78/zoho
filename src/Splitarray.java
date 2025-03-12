import java.util.Arrays;
/*split array into m parts and then add the splited array respetively  array pick the maximum sum from that max sum return the smallest sum..
eg:-
arr=12,19,14,10
m=2
possible splits are
12        19,14,10   add the arrays separately      12     43  pic max sum    43      pic smalllest from the max sum
12,19        14,10                                  31     14                 31-----> 31   ans found
12,19,14        10                                  45     10                 45
 */
public class Splitarray
 {
    public static void main(String[] args)
    {
        int []nums={12,19,14,10};
        int m=2;
        System.out.println( splitArray(nums,m));
    }
    public static int splitArray(int[] nums,int m)
    {
        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++)
        {
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<end)
        {
             int mid=start+(end-start)/2;

             int sum = 0;
             int pieces = 1;
             for (int num : nums)
             {
                 if (sum + num > mid)
                 {
                     sum = num;
                     pieces++;
                 }
                 else
                 {
                     sum += num;
                 }
             }
             if (pieces > m)
             {
                 start = mid + 1;
             }
             else
             {
                 end=mid;
             }

        }
        return start;
    }
 }


