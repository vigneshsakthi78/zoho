import java.util.Arrays;
/* traverse the 2dimensional  array and find the target's index no.using binary search
*/
public class Rowcolmatrix {
    public static void main(String[] args) {
        int [][]matrix={{10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,58}};
        int target=29;
        System.out.println("The given target is located in the index of"+ Arrays.toString(searchin2d(matrix,target)));

    }
    public static int []searchin2d(int [][]arr,int target)
    {
        int r=0;
        int c=arr.length-1;
        while(r<arr.length&&c>0)
        {
            if(arr[r][c]==target)
            {
                return new int[]{r,c};
            }
            if(arr[r][c]<target)
            {
                r++;
            }
            if(arr[r][c]>target)
            {
               c--;
            }
        }
        return new int[]{-1,-1};
    }

}
