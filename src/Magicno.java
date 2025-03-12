public class Magicno {
    public static void main(String[] args) {
        int n=4;
       uniqueNo(n);
    }

    public static void uniqueNo(int arr) {
          int sum=0;
          int base=5;
        while (arr>0){
            int last=arr&1;
           arr= arr>>1;
           
            sum+=last*base;
            base=base*5;
        }
        System.out.println(sum);
    }
}
