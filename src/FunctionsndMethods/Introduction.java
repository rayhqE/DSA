package FunctionsndMethods;

import java.util.Scanner;

public class Introduction {
    public static void printMyName(String name) {
        System.out.println(name + "  is a  CSE Student");
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name u wanna print: ");
        String name = input.next();

        printMyName(name);
    }
}

