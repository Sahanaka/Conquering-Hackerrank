import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution
{
    static void extraLongFactorials(int n)
    {
        BigInteger factorial = new BigInteger("1");

        for (int i = 2; i <= n; ++i)
            factorial = factorial.multiply(BigInteger.valueOf(i));

        System.out.println(factorial);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = scanner.nextInt();


        extraLongFactorials(n);


        scanner.close();
        System.exit(0);
    }
}
