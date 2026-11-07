//TODO: Print the Pattern6 pattern: inverted triangle of descending row counts with numbers 1..i
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern6{
    public static void main(String[] args){
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}