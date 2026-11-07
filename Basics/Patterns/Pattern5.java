//TODO: Print the Pattern5 pattern: inverted right-angled triangle of stars
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern5{
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}