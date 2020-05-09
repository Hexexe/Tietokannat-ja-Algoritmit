package Tehtävä_20_Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<TrafficCard> {

    @Override
    public int compare(TrafficCard o1, TrafficCard o2) { return o1.mOwnerName.compareTo(o2.mOwnerName); }
}
