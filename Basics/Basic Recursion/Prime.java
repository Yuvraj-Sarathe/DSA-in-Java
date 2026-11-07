//TODO: Check primality with recursion instead of a loop (iterative version lives in ../Basic Maths/Sieve_Prime/Prime.java)
// Time: O(sqrt(n)) - recursive odd-divisor checks
// Space: O(sqrt(n)) - recursion stack

public class Prime { 
    public boolean checkPrime(int num) { 
        if (num <= 1) return false; 
        if (num == 2) return true; 
        if (num % 2 == 0) return false; 
        
        return primeHelp(num, 3);
    } 

    private boolean primeHelp(int n, int div) { 
        if (div * div > n) return true; 
        if (n % div == 0) return false; 
        
        return primeHelp(n, div + 2);
    }
}
