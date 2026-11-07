//TODO: Print the Pattern9 pattern: inverted centered pyramid of stars
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern9 {
    public static void main(String[] args){
        int row = 5;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*(row-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
