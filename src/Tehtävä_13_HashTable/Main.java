package Tehtävä_13_HashTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashT hashT = new HashT(10);
        int choice;
        do {
            System.out.println("1. lisää");
            System.out.println("2. hae");
            System.out.println("3. tulosta");
            System.out.println("4. exit");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Kirjoita haluamasi asia:");
                    hashT.add(scan.next());
                    break;
                case 2:
                        System.out.println("Hae data arvon perusteella:");
                        String s = hashT.find(scan.next());
                        System.out.printf(s == null ? "Dataa ei löytynyt\n" : "Data %s löytyi\n", s);
                    break;
                case 3:
                    hashT.print();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (choice != 4);
    }
}

