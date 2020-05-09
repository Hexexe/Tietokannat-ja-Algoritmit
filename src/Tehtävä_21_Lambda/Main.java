package Tehtävä_21_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<TrafficCard> cardUsers = new ArrayList<>();
        RandomString rString = new RandomString(10);
        TrafficCard myCard;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            myCard = new TrafficCard(r.nextInt(100), rString.nextString(), ((float) r.nextInt(1000) / 10));
            cardUsers.add(myCard);
        }
        System.out.println("\nGeneroidut Traffic Cards\n");
        cardUsers.forEach(System.out::println);

        System.out.println("\nKortit sortattu balancen perusteella käyttäen lambda\n");
        cardUsers.sort(((o1, o2) -> Float.compare(o1.mBalance, o2.mBalance)));
        cardUsers.forEach(System.out::println);
    }
    
}
