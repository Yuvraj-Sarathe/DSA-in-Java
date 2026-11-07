//TODO: Convert an Excel column title (A, B, ..., AA) to its 1-based number - LeetCode 171 (base-26)
// Time: O(len) - one pass over the title
// Space: O(1) - only the result accumulator

public class Excel_Column {
    public int titleToNumber(String columnTitle) {
        //! Convert Excel column (A, B, Z, AA, AB...) to number (1, 2, 26, 27, 28...)
        //* Formula: Base-26 conversion → result = result*26 + (char-64)
        //& ASCII: A=65, so 'A'-64=1, 'B'-64=2, 'Z'-64=26
        
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 64); // Shift left in base-26, add digit
        }
        
        return result; // Example: "AB" → 1*26 + 2 = 28
    }
}
