//TODO: Find the longest common prefix string among an array of strings - LeetCode 14
// Time: O(S) - shrink prefix while scanning all strings (S = total characters)
// Space: O(n) - prefix substring copies

public class Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
