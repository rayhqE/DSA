package FunctionsndMethods;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            System.out.println("Invalid Number");
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = inp.nextInt();
        if (checkPrime(n)) {
            System.out.println(n + " is Prime");
        } else if (n > 1) {
            System.out.println(n + " is not Prime");
        }
    }
}
