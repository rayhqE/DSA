package FunctionsndMethods;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = inp.nextInt();
        System.out.println("Enter your Second Number: ");
        int b = inp.nextInt();
        System.out.println("Product of These Two Numbers are: " + calculateProduct(a, b));
    }
}
