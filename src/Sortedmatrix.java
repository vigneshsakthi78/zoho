import java.util.Arrays;

public class Sortedmatrix {
    public static void main(String[] args) {
int[][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
int target=193;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] binarySearch(int [][]arr,int rows,int cStart,int cEnd,int target)
    {
        while(cStart<=cEnd)
        {
            int mid = cStart + (cEnd - cStart) / 2;
            if(arr[rows][mid]==target)
            {
                return new int[]{rows,mid};
            }
            if(arr[rows][mid]<target)
            {
                cStart=mid+1;
            }
            else
            {
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][]matrix,int target)
    {
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1)
        {
            return  binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        while(rStart<(rEnd-1))//run untill two rows remaining
        {
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target)
            {
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target)
            {
                 rStart=mid;
            }
            else
            {
                rEnd=mid;
            }
        }
        //now search in two rows
        //search in the middle column of 2 rows
         if(matrix[rStart][cMid]==target)
         {
             return new int[]{rStart,cMid};
         }
        if(matrix[rStart+1][cMid]==target)
        {
            return new int[]{rStart+1,cMid};
        }
        //search in first  half
        if(matrix[rStart][cMid-1]>=target)
        {
              return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //search in sec    half
        if(matrix[rStart][cMid+1]<=target&&target<=matrix[rStart][cols-1])
        {
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //search in third  half
        if(matrix[rStart+1][cMid-1]>=target)
        {
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //search in fourth half
       else
        {
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }


}
