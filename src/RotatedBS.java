public class RotatedBS {
    public static void main(String[] args) {
        int[]arr={2,2,2,2,9,3,2,1};
        //{2,4,5,6,0,1}
        int target=2;
        System.out.println(BSwithpivot(arr, target));
    }
    static int findPivot(int[]arr)
    {
       int start=0;
       int end=arr.length-1;
      while (start<=end)
      {
          int mid=start+(end-start)/2;
          if(mid<end && arr[mid]>arr[mid+1])
          {
              return mid;
          }
          if(mid>start && arr[mid]<arr[mid-1])
          {
              return mid-1;
          }
          if (arr[start] >= arr[mid]) {
              end=mid-1;
          }
          else
          {
              start=mid+1;
          }
      }
      return-1;
    }
    static int findPivotwithduplicates(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]) {
                if (arr[start] < arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] > arr[end - 1]) {
                    return end;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end]))
        {
            start=mid+1;
        }
            else
        {
            end=mid-1;
        }
        }
        return-1;
    }
    static int binarysearch(int[]arr,int target,int start,int end){
        while(start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid]>target)
            {
                end=mid-1;
            }
            else if (arr[mid]==target) {
                return mid;
            }
        }
        return -1;
    }
    static int BSwithpivot(int[]arr,int target)
    {

            int pivot = findPivotwithduplicates(arr);

        if(pivot==-1)
        {
            return binarysearch(arr,target,0,arr.length-1);
        }
        if ( arr[pivot] ==target) {
            return pivot;
        }
        if(target>=arr[0])
        {
            return binarysearch(arr,target,0, pivot-1);
        }
        else {
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }
    }
}
