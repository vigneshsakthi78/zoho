package Strings;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        perm("", str);
    }
    static void perm(String b,String a)
    {
        if (a.isEmpty())
        {
            System.out.println(b);
            return;
        }
        char ch=a.charAt(0);
        for (int i = 0; i <=a.length() ; i++) {
            perm(b+ch,a.substring(1));
        }

    }
}
