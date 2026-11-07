//TODO: Print the Pattern7 pattern: centered pyramid of stars (2*i-1 stars per row)
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern7{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <=5-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}