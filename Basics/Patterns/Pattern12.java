//TODO: Print the Pattern12 pattern: number triangle - row number repeated per row
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        
        /* ═══════════════════════════════════════════════════════════════
         * 🔢 NUMBER TRIANGLE - Row Number Repeated
         * ═══════════════════════════════════════════════════════════════
         * Output (n=5):
         * 1 
         * 2 2 
         * 3 3 3 
         * 4 4 4 4 
         * 5 5 5 5 5 
         * 
         * 🎯 ANALYSIS:
         * - Left-aligned triangle
         * - Each row prints its row number
         * - Row i prints number 'i' exactly 'i' times
         * 
         * 🔧 FORMULA:
         * Row | Count | Number
         *  1  |   1   |   1
         *  2  |   2   |   2
         *  3  |   3   |   3
         *  4  |   4   |   4
         *  5  |   5   |   5
         * 
         * 📐 Inner loop runs 'i' times, prints 'i'
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP: Row number (1 to n)
        for(int i = 1; i <= n; i++){
            
            // 🔁 INNER LOOP: Print row number 'i' times
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");  // Print current row number
            }
            System.out.println();
        }
    }
}
