package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----------------");
            System.out.println("Choose an option:");
            System.out.println("1 - Increment");
            System.out.println("2 - Stop");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    new Counter();
                    System.out.println("Total instances created: " + Counter.getCount());
                    break;
                case 2:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
