package Strings;

import java.util.Arrays;

public class RemoveAlphabet {
    public static void main(String[] args) {

        /*String str1=str.substring(str.length());
        System.out.println(Arrays.toString(str1.toCharArray())+" hey! I am the substring of str, OOP'S am i empty `_`   ");
        System.out.println("don't worry i remove all the letter e and print remaining of the given string");
        System.out.println("then i am loaded with alphabets");
        for (int i = str.length()-1; i >=0 ; i--)
        {
            if ((str.charAt(i))!='e')
            {
                str1 = str.charAt(i) + str1;
            }
        }
        System.out.println(str1);*/

String S="bedappfegh";
        S=skipAppifApple(S);
        System.out.println(S);
        //remove(str,str1);

    }
    static void remove(String a,String b)
    {

        if(a.isEmpty()) {
            System.out.println(b);
            return;
        }
        char ch=a.charAt(0);
        if(ch=='e')
        {
           remove(a.substring(1),b);
        }
        else
        {
            remove(a.substring(1),b+ch);
        }

    }
    static String skip(String a)
    {
//bedefegh
        if(a.isEmpty()) {

            return"";
        }
        char ch=a.charAt(0);
        if(ch=='e')
        {
            return skip(a.substring(1));
        }
        else
        {
            return ch+skip(a.substring(1));
        }

    }
    //remove string of character from the given string
    static String skipApp(String s)
    {
        if(s.isEmpty())
        {
            return "" ;
        }
        char ch=s.charAt(0);
        if (s.startsWith("apple"))
        {
         return skipApp(s.substring(5));
        }
        else
        {
            return ch+skipApp(s.substring(1));
        }
    }
    static  String skipAppifApple(String s)
    {
        if(s.isEmpty())
        {
            return "" ;
        }
        char ch=s.charAt(0);
        if (s.startsWith("app")&& !s.startsWith("apple"))
        {
            return skipApp(s.substring(3));
        }
        else
        {
            return ch+skipApp(s.substring(1));
        }
    }

}
