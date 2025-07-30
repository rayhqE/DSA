package FunctionsndMethods;

import java.util.Scanner;

public class Check_EligibleToVote {
    public static boolean chechAge(int n) {

        return n >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int n = sc.nextInt();
        if (chechAge(n)) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
