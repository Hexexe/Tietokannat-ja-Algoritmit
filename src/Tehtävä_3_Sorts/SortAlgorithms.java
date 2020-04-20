package Tehtävä_3_Sorts;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class SortAlgorithms {
    static int MAX = 100;
    static long count = 0;
    private static int[] tau;

    public static void main(String[] args) {
        while (MAX <= 30000) {
            count = 0;
            selectSort();
            saveRecord(MAX, count);
            MAX += 100;
        }
        MAX = 100;
        while (MAX <= 30000) {
            count = 0;
            mergeSort();
            saveRecord(MAX, count);
            MAX += 100;
        }
        MAX = 100;
        while (MAX <= 30000) {
            count = 0;
            quickSortLoop();
            saveRecord(MAX, count);
            MAX += 100;
        }
    }

    public static void saveRecord(int arraySize, long count) {
        try (FileOutputStream f = new FileOutputStream("new.csv", true)) {
            BufferedOutputStream b = new BufferedOutputStream(f);
            PrintWriter pw = new PrintWriter(b);
            pw.println(arraySize + ";" + count);
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectSort() {

        int[] taul = new int[MAX]; //taul tallettaa lajiteltavat tiedot
        int i, j, apu, pienin;
        Random r = new Random(); //luodaan satunnaislukugeneraattori
        for (i = 0; i < MAX; i++) { taul[i] = r.nextInt(1000); } //generoidaan luvut
        for (i = 0; i < MAX; i++) {
            pienin = i;
            count++; // ulompi
            for (j = i + 1; j < MAX; j++) {
                /* löytyykö taulukon loppupäästä pienempää alkiota? */
                count++; // sisempi
                if (taul[j] < taul[pienin]) {
                    pienin = j;
                }
                count++;
            }
            count++;
            if (pienin != i) {
                /* jos löytyi suoritetaan alkioiden vaihto */
                apu = taul[pienin];
                taul[pienin] = taul[i];
                taul[i] = apu;
            }
            count++;
        }
    }

    public static void mergeSort() {
        int[] taul = new int[MAX];
        int i;
        Random r = new Random(); //luodaan satunnaislukugeneraattori
        for (i = 0; i < MAX; i++) { taul[i] = r.nextInt(1000); } //generoidaan luvut
        mergeSort(taul, 0, MAX - 1);
    }


    //oletus: osataulukot t[p..q] ja t[q+1...r] ovat järjestyksess„
    public static void merge(int[] t, int p, int q, int r) {
        //i osoittaa 1. osataulukkoa, j osoittaa 2. osataulukkoa
        // k osoittaa aputaulukkoa, johon yhdiste kirjoitetaan.
        tau = new int[MAX]; // aputaulukko (ei varata tätä pinosta!)
        int i = p, j = q + 1, k = 0;
        count+=2;
        while (i < q + 1 && j < r + 1) {
            count++;
            if (t[i] < t[j]) {
                tau[k++] = t[i++];
            } else {
                tau[k++] = t[j++];
            }
            count+=2;
        }
        count++;
        //toinen osataulukko käsitelty, siirretään toisen käsittelemättömät
        while (i < q + 1) {
            tau[k++] = t[i++];
            count++;
        }
        count++;
        while (j < r + 1) {
            tau[k++] = t[j++];
            count++;
        }
        count++;
        //siirretään yhdiste alkuperäiseen taulukkoon
        for (i = 0; i < k; i++) {
            t[p + i] = tau[i];
            count++;
        }
    }

    public static void mergeSort(int[] t, int alku, int loppu) {
        int ositus;
        long la, ll, lt;
        count++;
        if (alku < loppu) { //onko väh. 2 alkiota, että voidaan suorittaa ositus
            la = alku;
            ll = loppu;
            lt = (la + ll) / 2;
            ositus = (int) lt;
            count++;
            mergeSort(t, alku, ositus);//lajitellaan taulukon alkupää
            count++;
            mergeSort(t, ositus + 1, loppu);//lajitellaan taulukon loppupää
            count++;
            merge(t, alku, ositus, loppu);//yhdistetään lajitellut osataulukot
            count++;
        }
    }

    public static void quickSortLoop() {
        int[] taul = new int[MAX];
        Random r = new Random();
        int i;
        for (i = 0; i < MAX; i++) {
            taul[i] = r.nextInt(1000);
        }
        qs(taul, MAX);
    }

    public static void quickSort(int[] table, int lo0, int hi0) {
        int lo = lo0;
        int hi = hi0;
        int mid, swap;
        mid = table[(lo0 + hi0) / 2];
        count++;
        while (lo <= hi) {
            count++;
            while (table[lo] < mid) {
                ++lo;
                count++;
            }
            count++;
            while (table[hi] > mid) {
                --hi;
                count++;
            }
            count++;
            if (lo <= hi) {
                swap = table[lo];
                table[lo] = table[hi];
                ++lo;
                table[hi] = swap;
                --hi;
            }
            count++;
        }
        count++;
        if (lo0 < hi) {
            quickSort(table, lo0, hi);
        }
        count++;
        if (lo < hi0) {
            quickSort(table, lo, hi0);
        }
    }

    public static void qs(int table[], int values) {
        quickSort(table, 0, values - 1);
    }
}

