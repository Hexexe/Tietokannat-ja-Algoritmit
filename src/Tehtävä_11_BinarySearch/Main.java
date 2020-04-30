package Tehtävä_11_BinarySearch;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        String arvo;
        int result;
        int i;
        do {
            System.out.println(" 1. Printtaa lista\n 2. Lisää uusi luku\n 3. Etsi listasta\n 4. Listan pienin luku\n 5. Listan suurin luku\n 6. lopeta");
            arvo = scanner.next();
            switch (arvo) {
                case "1":
                    System.out.println(list);
                    break;
                case "2":
                    System.out.println("kirjoita lisättävä luku:");
                    i = scanner.nextInt();
                    list.add(i);
                    Collections.sort(list);
                    System.out.printf("Luku %d lisätty listaan\n",i);
                    break;
                case "3":
                    System.out.println("Etsi luku listasta:");
                    i = scanner.nextInt();
                    result = bs.binarySearch(list, 0, list.size() - 1, i);
                    if (result == -1) System.out.println("Elementtiä ei löytynyt");
                    else System.out.printf("Elementti %d löytyi indeksistä %d\n", i, result);
                    break;
                case "4":
                    i = Collections.min(list);
                    result = bs.binarySearch(list, 0, list.size() - 1, i);
                    System.out.printf("Listan pienin elementti %d löytyi indeksistä %d\n", i, result);
                    break;
                case "5":
                    i = Collections.max(list);
                    result = bs.binarySearch(list, 0, list.size() - 1, i);
                    System.out.printf("Listan suurin elementti %d löytyi indeksistä %d\n", i, result);
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
        } while (!arvo.equals("6"));
    }
}
