import java.util.Scanner;

public class Nopat {


        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            //Taking rows value from the user

            System.out.println("How many rows you want in this pattern?");

            int rows = sc.nextInt();

            System.out.println("Here is your pattern....!!!");

            for (int i = 1; i <= rows; i++)
            {
                //Printing rows-i spaces at the beginning of each row

                for (int j = 1; j <= rows-i; j++)
                {
                    System.out.print(" ");
                }

                //Printing i to 2*i value at the end of each row

                for (int j = i; j < 2*i; j++)
                {
                    System.out.print(j+" ");
                }

                System.out.println();
            }

            //Closing the resources

            sc.close();
        }
    }

