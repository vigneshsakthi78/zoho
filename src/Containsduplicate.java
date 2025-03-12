import java.util.ArrayList;
import java.util.List;

public class Containsduplicate {
    public static void main(String[] args) {
        int[]arr={0};
        boolean a=containsDuplicate(arr);
        System.out.println(a);
    }
    public static boolean containsDuplicate(int[] nums)
    {
        List<Integer> ans =findduplicates(nums);
        System.out.println(ans);
        if (!ans.isEmpty())
        {
                return true;
            }

        return false;
    }
    static List<Integer> findduplicates(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]<=arr.length&&arr[i]>0&&arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < arr.length ; index++)
        {

            if(arr[index]!=index+1&&arr[index]>0&&arr[index]< arr.length)
            {
                ans.add(arr[index]);
            }
        }
        return ans;

    }
    static void swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}



