package Tehtävä_18_Speedrun;

import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        BinaryTree btree = new BinaryTree();
        Random random = new Random();
        String[] a = new String[100000];
        for (int i = 0; i <a.length ; i++) { a[i] = ""+random.nextInt(); }
        long startTime, endTime;

        startTime = System.nanoTime();
        for (String i : a) { tree.add(i); }
        endTime = System.nanoTime();
        System.out.println("TreeSet: "+TimeUnit.MILLISECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS)+" ms");
        startTime = System.nanoTime();
        for (String i : a) { btree.insert(i); }
        endTime = System.nanoTime();
        System.out.println("Oma Puu: "+TimeUnit.MILLISECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS)+" ms");
        System.out.println("CPU: Ryzen 3700x");
    }
}

