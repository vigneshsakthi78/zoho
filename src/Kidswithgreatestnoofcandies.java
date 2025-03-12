

public class Kidswithgreatestnoofcandies {
    public static void main(String[] args) {
        int[]candies={2,4,7,1,5};
        int extracandies=3;
        int max=0;

        for (int i = 0; i <candies.length; i++)
        {
        candies[i]+=extracandies;
        if(candies[i]>max)
        {
            max=candies[i];

        }
    }
        System.out.println(max);
}}
