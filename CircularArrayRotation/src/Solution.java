import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {
        int[] result = new int[queries.length];
        int[] rotArray = new int[a.length];

        // Rotation is done using the % operator and storing it in the rotArray

        for (int i = 0; i < a.length; ++i)
        {
            int newIndex = (i + a.length + k) % a.length;
            rotArray[newIndex] = a[i];
        }

        for (int i = 0; i < queries.length; ++i)
            result[i] = rotArray[queries[i]];

        return result;
    }


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = scanner.nextInt(); // Array size
        int k = scanner.nextInt(); // No of rotations
        int q = scanner.nextInt(); // No of queries

        int[] a = new int[] {1 ,2 ,3};

        int[] queries = new int[] {0, 1, 2};

        System.out.println(Arrays.toString(circularArrayRotation(a, k, queries)));

        scanner.close();
        System.exit(0);
    }
}
