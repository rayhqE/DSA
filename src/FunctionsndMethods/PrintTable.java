package FunctionsndMethods;

import java.util.Scanner;

public class PrintTable {


    public static void printTable(int n) {
        int table;
        for (int i = 1; i <= 10; i++) {

            System.out.println(n + "X" + i + "=" + (n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printTable(n);
    }
}
