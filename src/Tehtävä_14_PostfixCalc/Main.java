package Tehtävä_14_PostfixCalc;

import Tehtävä_13_HashTable.HashT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PostFixCalc p = new PostFixCalc();
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. laske lasku");
            System.out.println("2. exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Syötä haluamasi lasku postfix muodossa '5,5,5,+,+' pilkulla erottaen :");
                    p.vastaus(scan.next());
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (choice != 2);
    }
}
    

