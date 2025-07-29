package FunctionsndMethods;

import java.util.Scanner;

public class FactorialOfTwoNumbers {
    public static void calcFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of this number is: " + factorial);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        calcFactorial(n);
    }
}
