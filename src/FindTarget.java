import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {
        int []arr={1,4,7,7,8,14,14};
        System.out.println(isFound(arr ,7,0));
        System.out.println(found(arr ,7,0));
        System.out.println(foundLast(arr, 7, arr.length - 1));
        foundBoth(arr,7,0);
       System.out.println(list);
        System.out.println("fb "+foundBothIn(arr ,7, 0,new ArrayList<>()));
        System.out.println("fbb "+foundBothInBody(arr ,7, 0));
    }
    static int isFound(int []arr ,int target,int i)
    {
        if(i>arr.length-1)
        {
            return -1;
        }
        if (arr[i]==target)
        {
            return i;
        }
            return isFound(arr, target, i+1);
    }
    static boolean found(int []arr ,int target,int i)
    {
        if(i>arr.length-1)
        {
            return false;
        }

        return arr[i]==target||found(arr, target, i+1);
    }
    static int foundLast(int []arr ,int target,int i)
    {
        if(i==-1)
        {
            return -1;
        }
        if (arr[i]==target)
        {
            return i;
        }

        return foundLast(arr, target, i-1);
    }
    static ArrayList<Integer>list=new ArrayList<>();
     static void foundBoth(int []arr,int target, int i)
     {
         if(i== arr.length)
         {
             return;
         }
         if (arr[i]==target)
         {
            list.add(i);
         }
         foundBoth(arr, target, i+1);
     }
    static ArrayList<Integer> foundBothIn(int []arr,int target, int i,ArrayList<Integer>list)
    {
        if(i== arr.length)
        {
            return list;
        }
        if (arr[i]==target)
        {
            list.add(i);
        }
        return foundBothIn(arr, target, i+1,list);
    }
    static ArrayList<Integer> foundBothInBody(int []arr,int target, int i)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(i== arr.length)
        {
            return list;
        }
        if (arr[i]==target)
        {
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls =foundBothInBody(arr, target, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
