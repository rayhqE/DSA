package FunctionsndMethods;

import java.util.Scanner;

public class PrintAverage {
    public static double printAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd Number: ");
        int c = sc.nextInt();
        System.out.println("Average of these three numbers are: " + printAverage(a, b, c));
        sc.close();
    }
}
