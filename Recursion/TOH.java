//TODO: Solve Tower of Hanoi for n disks printing each move
// Time: O(2^n - 1) - minimal number of moves
// Space: O(n) - recursion stack

import java.util.Scanner;
public class TOH {
    private static int stepCount = 0;

    public static void towerOfHanoi(int n, char src, char to, char help){

        if(n==1){
            stepCount++;
            IO.println("Disk " + n + " moved from " + src + " to " + to);
            return;
        }
        
        towerOfHanoi(n-1, src, help, to);
        stepCount++;
        IO.println("Disk " + n + " moved from " + src + " to " + to);

        towerOfHanoi(n-1, help, to, src);
    }

    void main(){
        Scanner sc = new Scanner(System.in);
        IO.print("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');
        IO.println("Total number of moves: " + stepCount);
        sc.close();
    }

}
