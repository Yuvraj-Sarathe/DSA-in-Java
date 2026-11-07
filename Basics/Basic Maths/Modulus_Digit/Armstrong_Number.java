//TODO: Check if a number equals the sum of the cubes of its digits
// Time: O(digits) - one pass over the digits
// Space: O(1) - only sum and temp

public class Armstrong_Number {
    static boolean armstrongNumber(int n) {
        //! Armstrong number are numbers that are equal to the sum of cubes of their digits
        int sum = 0;
        int temp = n;
        while(n>0){
            int digit = n%10;
            sum = sum+(digit*digit*digit); 
            n=n/10;
        }
        return sum==temp;
    }
}
