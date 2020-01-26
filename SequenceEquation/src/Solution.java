import java.util.Random;
import java.util.Scanner;

public class Solution
{
    static int[] permutationEquation(int[] p)
    {
        int[] result = new int[p.length];

        for(int i = 0; i < p.length; i++)
        {
            result[p[p[p[i]-1]-1]-1] = p[i];
        }

        return result;
    }



    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args)
    {
        //int n = scanner.nextInt(); // No of distinct integers

        int[] p = new int[] {4 ,3 ,5 ,1 ,2};

        /*for (int i = 0; i < n; ++i)
        {
            p[i] = Math.abs(rand.nextInt() % 100);
            System.out.println(p[i]);
        }
*/

        int[] res = permutationEquation(p);

        for (int i = 0; i < res.length; ++i)
            System.out.println(res[i]);

        scanner.close();
        System.exit(0);
    }
}
