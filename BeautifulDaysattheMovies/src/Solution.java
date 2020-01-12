import java.util.Scanner;

public class Solution
{
    public static int reverseNumber(int number)
    {
        int reversed = 0;

        while(number != 0)
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }


        return reversed;
    }

    static int beautifulDays(int i, int j, int k)
    {
        int count = 0;

        for (int itr = i; itr <= j; ++itr)
        {
            if (Math.abs((itr - reverseNumber(itr)) % k) == 0)
                ++count;
        }


        return count;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int i = scanner.nextInt(); // Starting number.
        int j = scanner.nextInt(); // Ending number.
        int k = scanner.nextInt(); // Divider.


        System.out.println(beautifulDays(i, j, k));

        System.exit(0);
    }
}
