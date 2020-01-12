import java.util.Scanner;

public class Solution
{
    static int saveThePrisoner(int n, int m, int s)
    {
        if ((s + m - 1) % n == 0)
            return n;

        else
        return ((s + m - 1) % n);
    }


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = scanner.nextInt(); // No of prisoners.
        int m = scanner.nextInt(); // No of candies.
        int s = scanner.nextInt(); // Starting seat no.


        System.out.println(saveThePrisoner(n, m, s));

        scanner.close();
        System.exit(0);
    }
}
