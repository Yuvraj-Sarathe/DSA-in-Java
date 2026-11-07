//TODO: Print the Pattern11 pattern: hollow rectangle - border stars only
// Time: O(rows * cols) - nested loops print every cell
// Space: O(1) - only loop counters

public class Pattern11 {
    public static void main(String[] args) {
        int rows = 5, cols = 7;
        
        /* ═══════════════════════════════════════════════════════════════
         * 🔲 HOLLOW RECTANGLE - Border Only Pattern
         * ═══════════════════════════════════════════════════════════════
         * Output (5x7):
         * * * * * * * * 
         * *           * 
         * *           * 
         * *           * 
         * * * * * * * *
         * 
         * 🎯 ANALYSIS:
         * - Simple 2D grid (rows x cols)
         * - Print stars ONLY at borders
         * - Print spaces for interior
         * 
         * 🔧 BORDER CONDITIONS:
         * - First row (i == 0)
         * - Last row (i == rows-1)
         * - First column (j == 0)
         * - Last column (j == cols-1)
         * 
         * 💡 KEY CONCEPT: Use IF condition to check borders
         * ═══════════════════════════════════════════════════════════════
         */
        
        // 🔁 OUTER LOOP: Iterate through rows
        for(int i = 0; i < rows; i++){
            
            // 🔁 INNER LOOP: Iterate through columns
            for(int j = 0; j < cols; j++){
                
                // ✅ CONDITION: Check if current position is on border
                if(i == 0 || i == rows-1 || j == 0 || j == cols-1)
                    System.out.print("* ");  // Border: print star
                else
                    System.out.print("  ");  // Interior: print space
            }
            System.out.println();
        }
    }
}
