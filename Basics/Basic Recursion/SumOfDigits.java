//TODO: Find sum of all digits of a number

public class SumOfDigits {
    public int sumOfDigits(int n) {
        if (n == 0) return 0;
        
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 9) return sumOfDigits(sum);
        return sum;
    }
}