package FunctionsndMethods;

import java.util.Scanner;

public class Print_Circumference {
    public static double calcCircumference(int r) {

        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        System.out.println("Circumference of the circle with radius " + r + " is " + calcCircumference(r));
    }
}
