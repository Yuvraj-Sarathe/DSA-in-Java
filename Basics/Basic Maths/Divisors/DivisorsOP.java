//TODO: Print all divisors of n using the naive 1..n scan (baseline approach)
// Time: O(n) - scan every number up to n
// Space: O(1) - only printing

public class DivisorsOP {
    public static void print_divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 12;
        print_divisors(n);
    }
}
