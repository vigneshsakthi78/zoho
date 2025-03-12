public class Jug {
    public static void main(String[] args) {
        int jug1 = 3;
        int jug2 = 5;
        int s1=3;
        int s2=1;
        int r=jug1*s1-jug2*s2;
        System.out.println("Extraction of  "+r+" liters is done");
    }
/*static int gcd(int a,int b)
{
    if(a==0)
    {
        System.out.println("Extraction of"+b+"liters of waters is done");
        return b;
    }

    return gcd(b%a,a);
}*/
}
