//TODO: Check if a number is ugly (only prime factors 2, 3, 5) - LeetCode 263
// Time: O(log n) - repeatedly divide by 2, 3, 5
// Space: O(1) - fixed factor array

public class Ugly_Number {
    public boolean isUgly(int n) {
        //!UGLY NUMBER are numbers that are divisible by only 2, 3, 5
        if(n<=0){
            return false;
        }
        int[] fact = {2, 3, 5};
        for(int f : fact){
            while(n%f==0){
                n/=f;
            }
        }
        return n==1;
    }
}
