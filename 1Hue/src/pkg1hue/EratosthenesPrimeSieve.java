/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1hue;

/**
 *
 * @author felix
 */
public class EratosthenesPrimeSieve implements PrimeSieve{
    
    int obergrenze;
    
    public EratosthenesPrimeSieve(int obergrenze)
    {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {
        //Math sqrt = Quadratwurzel
        
         { if (p <= 1) {
        return false; }
        for (int i = 2; i <= Math. sqrt(p); i++) { if (p % i == 0) {
            return false; }
        } return true;
        }
        }
    

    @Override
    public void printPrimes() {
        for (int i = 0; i <= obergrenze; i++) {
            
            if(isPrime(i)==true)
            {
                System.out.println(i);
            }
            else
            {
                System.out.println(i + "keine prim");
            }
        }
    }
    
}
