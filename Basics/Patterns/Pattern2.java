//TODO: Print the Pattern2 pattern: triangle of numbers 1..i on each row
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters


public class Pattern2 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
