/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1hue;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        System.out.println("start");
//        System.out.println();
//        System.out.println("obergrenze eingeben");
//
//        Scanner sc = new Scanner(System.in);
//        int obergrenze = sc.nextInt();
//
//        int[] zahlen = legeArrayAn(obergrenze);
//        bereiteArrayVor(zahlen);
//        pruefeIndex(zahlen);
//
//        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(obergrenze);
//        e.printPrimes(zahlen);
//
        ArrayList<Integer> geradenbisOG = new ArrayList<Integer>();
        ArrayList<Integer> primesbisOG = new ArrayList<Integer>();
        geradenbisOG = allegeradenbisobergrenze(10);
        primesbisOG = primzahlenbisobergrenze(10);

        primeplusprimeistgerade(geradenbisOG, primesbisOG);

    }

    public static int[] legeArrayAn(int n) {
        int[] meinArray = new int[n + 1];

        return meinArray;
    }

    public static void bereiteArrayVor(int[] a) {

        for (int i = 2; i < a.length; i++) {

            a[i] = 1;
        }
    }

    public static void pruefeIndex(int[] liste) {

        for (int i = 2; i < liste.length; i++) {
            if (liste[i] == 1) {
                entferneVielfacheVon(liste, i);
            }
        }
    }

    public static void entferneVielfacheVon(int[] liste, int faktor) {
        int i = 2;

        while (i * faktor < liste.length) {

            if (liste[i * faktor] == 1) {

                liste[i * faktor] = 0;
            }

            i++;
        }
    }

    public static ArrayList<Integer> allegeradenbisobergrenze(int obergrenze2) {
        int erg = 3;
        ArrayList<Integer> geraden = new ArrayList<Integer>();

        while (erg <= obergrenze2) {
            if (erg % 2 == 0) {
                geraden.add(erg);
            }
            erg++;
        }
        return geraden;
    }

    public static ArrayList<Integer> primzahlenbisobergrenze(int obergrenze2) {

        ArrayList<Integer> primes = new ArrayList<Integer>();
        EratosthenesPrimeSieve e1 = new EratosthenesPrimeSieve(obergrenze2);

        for (int i = 0; i <= obergrenze2; i++) {

            if (e1.isPrime(i) == true) {
                primes.add(i);
            }

        }
        return primes;
    }

    public static void primeplusprimeistgerade(ArrayList<Integer> geraden, ArrayList<Integer> primes) {

        int[] geradennew = geraden.stream().mapToInt(i -> i).toArray();
        int[] primesnew = primes.stream().mapToInt(i -> i).toArray();

        System.out.println(geradennew[0]);

    }

}
