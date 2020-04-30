package Tehtävä_12_BinaryHeap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BinaryHeap bh = new BinaryHeap(100);
        int i;
        int choice;
        do {
            System.out.println("1. insert ");
            System.out.println("2. delete min");
            System.out.println("3. print heap");
            System.out.println("4. exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.println("Anna luku:");
                        bh.insert(scan.nextInt());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Pienin elementti : " + bh.remove());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    bh.print();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            bh.print();
        } while (choice != 4);
    }
}
