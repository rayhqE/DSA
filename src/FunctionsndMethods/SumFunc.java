package FunctionsndMethods;

import java.util.Scanner;

public class SumFunc {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Nubmer: ");
        int b = sc.nextInt();
        System.out.println("Sum of these Numbers: " + calculateSum(a, b));


    }
}
