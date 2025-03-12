import java.util.Arrays;

public class Flipandinvert {
    public static void main(String[]args) {
        int [][]arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println( Arrays.deepToString(flipandInvertimage(arr)));

    }
    public static int [][]flipandInvertimage(int[][]image)
    {
        for(int []row:image)
        {
            //flip
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                //swap
                int temp=row[i]^1;
                 row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;

            }
        }
       // System.out.println(Arrays.toString());
        return image;
    }
}
