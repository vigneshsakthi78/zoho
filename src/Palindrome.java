import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String d="cattac";
        String e="";
        if(d==null)
        {
            System.out.println("str is null");
        }
        else {
            for (int i = d.length() - 1; i >= 0; i--) {
                e += d.charAt(i);
            }
            System.out.println(e);
            if (d.equals(e)) {
                System.out.println("Given String is palindrome");
            } else {
                System.out.println("Given String is  not palindrome");
            }
        }
boolean b=isPal(d);
        System.out.println("Using string builder: "+b);
        boolean c=isPAL(d);
        System.out.println("Uing start and end: "+c);

    }
    static boolean isPal(String str)
    {
        /*using String builder*/
       // String str ="malayalam";
        StringBuilder builder=new StringBuilder();
        builder.append(str);
        builder.reverse();
        String s=builder.toString();
        if (s.isEmpty()) {
        return true;
        }
        return s.equals(str);
    }
    /*using Start and end*/
    static boolean isPAL(String str)
    {
        if(str==null || str.isEmpty())
        {
            return true;
        }
        for (int i = 0; i <= str.length()/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-i-1);
            if(start!=end)
            {
                return false;
            }

        }

        return true;
    }
}

