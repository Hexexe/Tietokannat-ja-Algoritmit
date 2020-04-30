package Tehtävä_11_BinarySearch;

import java.util.List;

public class BinarySearch {

    int binarySearch(List<Integer> list , int left, int right, Integer x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            // keskellä
            if (list.get(mid).equals(x)) return mid;
            // jos pienempi niin vasemmalla
            if (list.get(mid) > x) return binarySearch(list, left, mid - 1, x);
            // muuten oikealla
            return binarySearch(list, mid + 1, right, x);
        }
        // ei löydy
        return -1;
    }
}
