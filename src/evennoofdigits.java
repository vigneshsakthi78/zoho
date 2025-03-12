public class evennoofdigits {
    public static void main(String[]args) {
        int[] arr = {11, 87, 9, 5680};
        int ans=digits(arr);
        System.out.println(ans);
    }
    static int digits(int[]arr){
        int check=0;


        for (int element : arr) {

            int count = 0;
            while (element > 0) {
                count++;
                element/=10;
            }int flag = 0;

            if (count % 2 == 0) {
                flag++;
            }

            check=check+flag;

        }
        return check;
    }
    }

