/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1hue;

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
        
        System.out.println("start");
        System.out.println();
        System.out.println("obergrenze eingeben");
        
        Scanner sc = new Scanner(System.in);
        int obergrenze = sc.nextInt();
        
        int [] zahlen = legeArrayAn(obergrenze);
        bereiteArrayVor(zahlen);
        pruefeIndex(zahlen);
        
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(obergrenze);
        e.printPrimes(zahlen);
     
        
        
    }
    
    public static int[] legeArrayAn(int n)
    {
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
            if(liste[i] == 1)
            {
                entferneVielfacheVon(liste, i);
            }
        }
    }
    
    public static void entferneVielfacheVon(int[] liste, int faktor)
    {
        int i = 2;
        
        while ( i* faktor < liste.length) {
            
            if(liste[i * faktor] == 1) {
                
                liste[i * faktor] = 0;
            }
            
            i++;
        }
    }
   
    
    
    
}
