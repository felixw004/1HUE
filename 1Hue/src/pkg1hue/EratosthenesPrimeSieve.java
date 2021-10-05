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
    
    public EratosthenesPrimeSieve()
    {
        
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
    }
    
}
