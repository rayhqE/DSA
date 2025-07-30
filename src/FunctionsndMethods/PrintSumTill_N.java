package FunctionsndMethods;

import java.util.Scanner;

public class PrintSumTill_N {

    public static int printSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Odd numbers from 1 to " + n + " is: " + printSum(n));
        sc.close();
    }
}
