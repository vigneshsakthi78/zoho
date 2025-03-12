/*ceiling of a number in an array
      if the array is sorted....
step 1: find the number which is greater than or equal to the target element
step 2: if the number which is equal to the target element then the answer found
step 3: if not then find the number which is greater than the target element but smaller among the greatest number
 */
public class Binarysearchint {
    public static void main(String[] args) {
int []arr={2,3,5,6,8,9,12,13,15};
int target=18;
int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[]arr,int target)
    {
        int start=0;
        int end=arr.length;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[arr.length-1])
            {
                return-1;
            }
   if(arr[mid]==target)
   {
       return mid;
   }
   else if (arr[mid]<target)
   {
       start=mid+1;
   }
   else if (arr[mid]>target)
   {
       end=mid-1;
   }
        }
        return start;
    }
}
