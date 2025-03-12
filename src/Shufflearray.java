import java.util.Arrays;

public class Shufflearray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int a = nums.length;
        int n = 3;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr = new int[a];
        for(int k=0;k<n;k++)
        {
            arr1[k]=nums[k];
        }
        int v=0;
        for (int l =(nums.length/2);l>0; l--)
        {
        arr2[v]=nums[n];
        n++;
        v++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int b = 0;
        for (int i = 0; i < a ; i = i + 2) {
            arr[i] = arr1[b];
            b++;
        }
        int c = 0;
        for (int j = 1; j < a ; j = j + 2) {
            arr[j] = arr2[c];
            c++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
