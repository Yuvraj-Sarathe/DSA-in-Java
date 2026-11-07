//TODO: Print the Pattern1 pattern: right-angled triangle of stars (row i has i stars)
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern1{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}