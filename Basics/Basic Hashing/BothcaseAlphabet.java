//TODO: Precompute frequency of every character (both cases) in a string, then answer q character-count queries
// Time: O(n + q) - one precompute pass + O(1) per query
// Space: O(256) - fixed ASCII hash array

import java.util.*;

public class BothcaseAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //*precompute:
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            //*fetch:
            System.out.println(hash[c]);
        }
    }
}
