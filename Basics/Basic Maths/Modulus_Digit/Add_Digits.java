//TODO: Repeatedly sum the digits of a number until a single digit remains (digital root) - LeetCode 258
// Time: O(1) - closed form via modulo 9
// Space: O(1) - no extra structures

public class Add_Digits {
    public int addDigits(int num) {
        //! Add digits of a number
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;
        }
        else{
            return num%9; //* Every number's reminder is the sum of digits of the number
        }
    }
}
