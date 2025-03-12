import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[]arr={10,7,4,2,3,1,5,9,6,8 };
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[]arr)
    {
        int i=0;
          while(i<arr.length) {
              int correct=arr[i]-1;
              if (arr[i] != arr[correct]) {
                  swap(arr, i, correct);
              } else {
                  i++;
              }
          }
    }
    static void swap(int[]arr,int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
