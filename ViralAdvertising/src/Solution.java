import java.util.Scanner;

public class Solution
{
    public static Scanner scanner = new Scanner(System.in);

    static int viralAdvertising(int n)
    {
        int liked = 0;
        int shares = 5;


        for (int i = 0; i < n; ++i)
        {
            int likes = (int) shares / 2;

            shares = likes * 3;

            liked += likes;
        }

        return liked;
    }

    public static void main(String[] args)
    {
        System.out.println("Solution 7");

        /*double test = 2.5 / 2;
        int ted = (int) test;*/ // Gets the floor value

        int n = scanner.nextInt();


        System.out.println(viralAdvertising(n));


        scanner.close();
        System.exit(0);
    }
}
