//TODO: Print numbers from n down to 1 using recursion (print before the recursive call)
// Time: O(n) - n recursive calls
// Space: O(n) - recursion stack

import java.util.Scanner;

public class Number_from_N_to_1{
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }

    public static void main(String[] args){
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(n);
        sc.close();
    }
}
