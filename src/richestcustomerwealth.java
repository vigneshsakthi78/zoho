public class richestcustomerwealth {
    public static void main(String[]args)
    {
        int[][] arr={{1,2,3},{4,5,9},{6,1,9}};
        int ans=rich(arr);
        System.out.println(ans);
    }
    static int rich(int[][]arr)
    {
        int max=0;
        for (int row = 0; row < arr.length; row++) {
            int sum=0;
            for (int col = 0; col <arr[row].length ; col++) {
                sum=arr[row][col]+sum;
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}
