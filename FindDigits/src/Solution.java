import java.util.Scanner;

public class Solution
{
    static int findDigits(int n)
    {
        int count = 0;

        // Integer division method is used

        int temp = n;

        while (temp > 0)
        {
            if (temp % 10 != 0 && (n % (temp % 10)) == 0)
                ++count;

            temp = temp / 10;
        }

        return count;
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = scanner.nextInt();

        System.out.println(findDigits(n));

        scanner.close();
        System.exit(0);
    }
}
