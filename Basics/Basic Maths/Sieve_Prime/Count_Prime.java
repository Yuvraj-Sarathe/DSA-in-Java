//TODO: Count primes strictly less than n using the Sieve of Eratosthenes - LeetCode 204
// Time: O(n log log n) - sieve marking
// Space: O(n) - boolean sieve array

class Count_Prime {
    public int countPrimes(int n) {
        //! Sieve of Eratosthenes - Count primes less than n
        
        if (n <= 2) return 0; // No primes below 2

        boolean[] isNotPrime = new boolean[n]; // false = prime, true = composite
        //& you can try with isPrime but then you will need to assign value o true to each index
        int count = 0;
        
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) { // Found a prime!
                count++;
                if ((long)i * i < n) { // Optimization: only mark if i² < n
                    for (int j = i * i; j < n; j += i) { // Mark all multiples as composite
                        isNotPrime[j] = true;
                    }
                }
            }
        }
        return count;
    }
}
