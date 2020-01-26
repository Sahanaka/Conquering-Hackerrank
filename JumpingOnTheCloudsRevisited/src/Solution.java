import java.util.Scanner;

public class Solution
{
    static int jumpingOnClouds(int[] c, int k)
    {
        // Jumping formula
        // c[i + k % n]

        int energy = 100; // Initial energy level
        int i = 0;

        do
        {
            --energy;

            if (c[(i + k) % c.length] == 1)
            {
                energy -= 2;
            }

            i = (i + k) % c.length;
        }
        while(i != 0);


        return energy;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        /*int n = scanner.nextInt(); // No of clouds
        int k = scanner.nextInt(); // Energy spent per jump */

        int[] c = new int[] {0 ,0 ,1 ,0 ,0 ,1 ,1 ,0}; // Array of clouds. 0 represents cumulus clouds and 1 represents thunderbolts


        System.out.println(jumpingOnClouds(c, 2));

        scanner.close();
        System.exit(0);
    }
}
