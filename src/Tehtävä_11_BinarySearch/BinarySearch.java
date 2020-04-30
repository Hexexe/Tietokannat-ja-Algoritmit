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

    int findMin(List<Integer> list, int left, int right)
    {
        if (right < left)  return list.get(0);

        // If there is only one element left
        if (right == left) return list.get(left);

        // Find mid
        int mid = left + (right - left)/2;

        // Check if element (mid+1) is minimum element. Consider
        // the cases like {3, 4, 5, 1, 2}
        if (mid < right && list.get(mid+1) < list.get(mid))
            return list.get(mid+1);

        // Check if mid itself is minimum element
        if (mid > left && list.get(mid) < list.get(mid-1))
            return list.get(mid);

        // Decide whether we need to go to left half or right half
        if (list.get(right) > list.get(mid))
            return findMin(list, left, mid-1);
        return findMin(list, mid+1, right);
    }
}
