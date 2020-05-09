package Tehtävä_20_Comparator;

import java.util.Comparator;

public class BalanceComparator implements Comparator<TrafficCard> {
    @Override
    public int compare(TrafficCard o1, TrafficCard o2) { return Float.compare(o1.mBalance, o2.mBalance); }
}
