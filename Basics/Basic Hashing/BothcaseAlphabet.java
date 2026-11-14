//TODO: Precompute frequency of every character (both cases) in a string, then answer q character-count queries
// Time: O(n + q) - one precompute pass + O(1) per query
// Space: O(256) - fixed ASCII hash array

public class BothcaseAlphabet {
    private final int[] hash = new int[256];

    public BothcaseAlphabet(String s) {
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
    }
    
    public int query(char c) {
        return hash[c];
    }
}
