package Tehtävä_22_Aggregate;

import java.util.ArrayList;
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

        System.out.println("\nKortit sortattu balanssin mukaan 0-50 väliltä ja  traveller numero alle tai tasan 40\n");
        cardUsers.stream().filter(t -> (t.mBalance >= 0 && t.mBalance <= 50) && t.mTravellerNumber <= 40).forEach(System.out::println);
    }
    
}
