package Tehtävä_13_HashTable;

import java.util.Arrays;

public class HashT {

    private String[] intel;
    private int size;

    public HashT(int size) {
        this.size = size;
        intel = new String[size];
    }

    public void add(String s) {
        int v = Math.abs(s.hashCode()) % intel.length;
        if (intel[v] != null) {
            for (int i = 0; i < size; i++) {
                if (intel[i] == null) {
                    intel[i] = s;
                    break;
                }
            }
        } else intel[v] = s;
    }

    public String find(String s) {
        int v = Math.abs(s.hashCode()) % intel.length;
        if (intel[v % intel.length].equals(s)) { return intel[v]; }
        for (int i = 0; i < size; i++) { if(intel[i].equals(s)) return intel[i]; }
        return null;
    }

    public void print() { System.out.println(Arrays.toString(intel)); }
}
