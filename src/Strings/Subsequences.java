package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequences
{
    public static void main(String[] args)
    {
        String s="abc";
        String s1="";

        System.out.println(subsequenceAscii(s1,s));

    }
    static void subsequence(String s1,String s)
    {
         if (s.isEmpty())
         {
             System.out.print(s1+" ");
             return;
         }
         char ch=s.charAt(0);
         subsequence(s1 + ch,s.substring(1));
        subsequence(s1,s.substring(1));
    }
    static ArrayList<String>subsequence1(String s1, String s)
    {
        if (s.isEmpty())
        {
            ArrayList<String> list =new ArrayList<>();
            list.add(s1);
            return list;
        }
        char ch=s.charAt(0);
        ArrayList<String>left=subsequence1(s1 + ch,s.substring(1));
        ArrayList<String>right=subsequence1(s1,s.substring(1));
        left.addAll(right);
        return left;
    }
    static void subsequence3(String s1,String s)
    {
        if (s.isEmpty())
        {
            System.out.print(s1+" ");
            return;
        }
        char ch=s.charAt(0);
        subsequence3(s1 + ch,s.substring(1));
        subsequence3(s1 + (ch+0),s.substring(1));
        subsequence3(s1,s.substring(1));
    }
    static ArrayList<String>subsequenceAscii(String s1, String s)
    {
        if (s.isEmpty())
        {
            ArrayList<String> list =new ArrayList<>();
            list.add(s1);
            return list;
        }
        char ch=s.charAt(0);
        ArrayList<String>first=subsequenceAscii(s1 + ch,s.substring(1));
        ArrayList<String>third=subsequenceAscii(s1 + (ch+0),s.substring(1));
        ArrayList<String>second=subsequenceAscii(s1,s.substring(1));

        first.addAll(third);
        first.addAll(second);
        return first;
    }

}
