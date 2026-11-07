//TODO: Count digits of a number that divide the number evenly - LeetCode 2344
// Time: O(digits) - one pass over the digits
// Space: O(1) - only counters

public class Count_the_Digits_that_Divide_a_Number {
    public int countDigits(int num) {
        int count=0;
        // Store original number
        int temp=num;
        while(num>0){
            // Extract last digit
            int d = num%10;
            // Check if digit divides original number (skip zero)
            if(d!=0 && temp%d==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
