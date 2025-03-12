public class Firstmissingpositive {
    public static void main(String[] args) {
        int[]arr={3,4,-1,1};
        System.out.println(missingPositive(arr));
    }
    static int missingPositive(int[]arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if( arr[i]>0 && arr[i]<= arr.length && arr[i]!=arr[correct] )
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!=index+1 )
            {
                return index+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[]arr,int fist,int sec)
    {
        int temp=arr[fist];
        arr[fist]=arr[sec];
        arr[sec]=temp;
    }
}
