public class ArrayMax {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,6,9},{909,99}};
        int ans=max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr)
    {
        int maxval=arr[0][0];  //minval
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]>maxval) //<minval
                {
                    maxval=arr[row][col];
                }
            }
        }
        return maxval;
    }
}
