//TODO: Print the Pattern3 pattern: triangle of descending numbers (i..1) on each row
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern3 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}