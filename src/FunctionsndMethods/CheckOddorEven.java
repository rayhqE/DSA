package FunctionsndMethods;

import java.util.Scanner;

public class CheckOddorEven {

    public static boolean checkNum(int n) {
        return (n % 2 == 0);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = inp.nextInt();
        if (checkNum(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
