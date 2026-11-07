//TODO: Find all divisors of n in O(sqrt(n)) by pairing i and n/i
// Time: O(sqrt(n)) - loop up to sqrt(n)
// Space: O(d) - list of divisors (d = number of divisors)

import java.util.*;

public class Divisors {
    public int[] divisors(int n) {
        //! Find all divisors in O(√n) time
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=Math.sqrt(n); i++){ // Check only up to √n
            //* n*i=i*n so we can take 2 divisors from 1 iteration only */
            if(n%i==0){ // i is a divisor
                list.add(i); // Add smaller divisor
                if(i!=n/i){ // Avoid duplicates for perfect squares
                    list.add(n/i); // Add corresponding larger divisor
                }
            }
        }
        
        Collections.sort(list); 
        return list.stream().mapToInt(x -> x).toArray(); // Convert List to int[]
    }
}
