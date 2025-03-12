public class SortOrnot {
    public static void main(String[] args) {
        int []arr={1,33,82,115};

        System.out.println(isSorted(arr,0));
    }
    static boolean sortOrNot(int []arr)
    {
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<arr[i-1])
            {
                return false;
            }

        }
        return true;
    }
    static boolean isSorted(int[]arr,int i)
    {

        if(i==arr.length-1)
        {
            return true;
        }
        return arr[i]<arr[i+1] && isSorted(arr,i+1);
    }




}
