package FunctionsndMethods;

import java.util.Scanner;

public class Find_Greater_Among_TwoNumbers {
    public static int findGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st num: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd num: ");
        int b = sc.nextInt();
        System.out.println("Greater Number is: " + findGreater(a, b));
        sc.close();

    }
}
