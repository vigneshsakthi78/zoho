import java.util.Arrays;

public class TwoDarry {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},
                      {6,89,8},
                      {1,89},
                      {7,89,-9}};
        int target=89;
        int[]ans=twodsearch(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twodsearch(int[][]arr,int target)
    {
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length; col++)
            {
            if(arr[row][col]==target)
              {
                return new int[]{row,col};
              }
            }
        }
        return new int[]{-1,-1};
    }

}
