package FunctionsndMethods;

import java.util.Scanner;

public class RaisedToThePower {
    public static double solution(double x, double n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second Number: ");
        int n = sc.nextInt();
        System.out.println("Solution is: " + solution(x, n));
    }
}
