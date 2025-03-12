package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int []arr={8,4,3,5,9,6};
    arr=mergeRecursion(arr);
    System.out.println(Arrays.toString(arr));
    }
    static int[] mergeRecursion(int []arr)
    {
        if(arr.length==1)
        {
            return arr ;
        }
        int m= arr.length/2;
        int []arr1= mergeRecursion(Arrays.copyOfRange(arr,0,m));
        int[]arr2=mergeRecursion(Arrays.copyOfRange(arr,m,arr.length));
        return merge(arr1,arr2);
    }
    static int[] merge(int []first,int[]second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i< first.length)
        {
             mix[k]=first[i];
             i++;
             k++;
        }
        while(j< second.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }

    }

