//TODO: Print the Pattern15 pattern: number pyramid - palindrome rows (centered)
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        
        /* ═══════════════════════════════════════════════════════════════
         * 🔢 NUMBER PYRAMID - Palindrome Pattern (Centered)
         * ═══════════════════════════════════════════════════════════════
         * Output (n=5):
         *     1
         *    212
         *   32123
         *  4321234
         * 543212345
         * 
         * 🎯 ANALYSIS:
         * - Centered pyramid
         * - Each row: descending numbers + ascending numbers
         * - Creates palindrome effect (reads same both ways)
         * 
         * 🔧 FORMULA:
         * Row | Spaces | Descending | Ascending
         *  1  |   4    |     1      |   (none)
         *  2  |   3    |    2,1     |    2
         *  3  |   2    |   3,2,1    |   2,3
         *  4  |   1    |  4,3,2,1   |  2,3,4
         *  5  |   0    | 5,4,3,2,1  | 2,3,4,5
         * 
         * 📐 Spaces: n-i
         * 📐 Descending: i down to 1
         * 📐 Ascending: 2 to i (skip 1 to avoid duplicate)
         * 
         * 💡 KEY: 3 inner loops - spaces, descending, ascending
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP: Rows (1 to n)
        for(int i = 1; i <= n; i++){
            
            // 🔁 INNER LOOP 1: Leading spaces for centering
            for(int j = 1; j <= n-i; j++) System.out.print(" ");
            
            // 🔁 INNER LOOP 2: Descending numbers (i to 1)
            for(int j = i; j >= 1; j--) System.out.print(j);
            
            // 🔁 INNER LOOP 3: Ascending numbers (2 to i)
            // Start from 2 to avoid printing '1' twice
            for(int j = 2; j <= i; j++) System.out.print(j);
            
            System.out.println();
        }
    }
}
