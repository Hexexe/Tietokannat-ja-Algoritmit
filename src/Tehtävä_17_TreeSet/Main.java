package Tehtävä_17_TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Integer> tree = new TreeSet<>();
        int choice;
        int a;
        do {
            System.out.println("\n1. lisää avain");
            System.out.println("2. hae avain");
            System.out.println("3. poista avain");
            System.out.println("4. puu laskevassa järjestyksessä");
            System.out.println("5. lopeta");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Lisää avain:");
                    tree.add(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Hae avain:");
                    a = scan.nextInt();
                    System.out.printf(!tree.contains(a) ? "avainta ei löytynyt" : "avain %d löytyi", a);
                    break;
                case 3:
                    System.out.println("Poista avain:");
                    a = scan.nextInt();
                    System.out.printf(!tree.remove(a) ? ("avainta ei löydy") : "avain %d poistettu", a);
                    break;
                case 4:
                    for (Integer i: tree.descendingSet()){ System.out.printf("%d, ",i); }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (choice != 5);
    }
}

