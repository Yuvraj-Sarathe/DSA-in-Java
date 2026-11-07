//TODO: Print the Pattern16 pattern: Pascal's triangle - binomial coefficients
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        
        /* ═══════════════════════════════════════════════════════════════
         * 🔺 PASCAL'S TRIANGLE - Binomial Coefficients
         * ═══════════════════════════════════════════════════════════════
         * Output (n=5):
         *     1 
         *    1 1 
         *   1 2 1 
         *  1 3 3 1 
         * 1 4 6 4 1 
         * 
         * 🎯 ANALYSIS:
         * - Centered triangle
         * - Each number = sum of two numbers above it
         * - Edges are always 1
         * - Used in combinatorics (nCr values)
         * 
         * 🔧 MATHEMATICAL FORMULA:
         * Row i, Position j: C(i,j) = i! / (j! * (i-j)!)
         * 
         * Efficient calculation:
         * Start with num=1
         * Next value = num * (i-j) / (j+1)
         * 
         * Row | Values
         *  0  | 1
         *  1  | 1 1
         *  2  | 1 2 1
         *  3  | 1 3 3 1
         *  4  | 1 4 6 4 1
         * 
         * 💡 KEY: Calculate each value from previous in same row
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP: Rows (0 to n-1)
        for(int i = 0; i < n; i++){
            
            // 🔁 INNER LOOP 1: Leading spaces for centering
            for(int j = 0; j < n-i; j++) System.out.print(" ");
            
            // 🧮 Initialize first value of row as 1
            int num = 1;
            
            // 🔁 INNER LOOP 2: Calculate and print values
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
                
                // 🧮 Calculate next value using formula
                // C(i,j+1) = C(i,j) * (i-j) / (j+1)
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
