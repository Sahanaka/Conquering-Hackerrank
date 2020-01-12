
/**
 * Cases:
 * 1. All the students are on time.
 * 2. All the students are late.
 * 3. Average case.
 * */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution
{
    static String angryProfessor(int k, int[] a)
    {
        int onTimeCount = 0;
        if (a[a.length - 1] <= 0) // Case 1
            return "YES";

        else if (a[0] > 0) // Case 2
            return "NO";

        else
        {
            for (int i = 0; i < a.length; ++i)
            {
                if (a[i] <= 0)
                    ++onTimeCount;
            }
        }

        if (onTimeCount >= k)
            return "YES";

        else
            return "NO";
    }


    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args)
    {
        int n = scanner.nextInt(); // No of students
        int k = scanner.nextInt(); // Threshold

        int[] a = new int[n]; // Arrival times of students. In the range from -100 to 100

        for (int i = 0; i < n; ++i)
        {
            a[i] = rand.nextInt(100 + 101) - 100;
            System.out.println(a[i]);
        }


        Arrays.sort(a);
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        System.out.println(angryProfessor(k, a));

        scanner.close();
        System.exit(0);
    }
}
