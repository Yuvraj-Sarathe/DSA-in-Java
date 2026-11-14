//TODO: Precompute frequency of each lowercase letter in a string, then answer q character-count queries
// Time: O(n + q) - one precompute pass + O(1) per query
// Space: O(26) - fixed alphabet array

public class LowecaseAlphabetHashing {
    private int[] hash = new int[256];

    public void precompute(String s) {
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
    }

    public int getCharacterCount(char c) {
        return hash[c];
    }

}