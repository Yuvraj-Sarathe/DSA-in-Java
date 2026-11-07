//TODO: Return the sum of the maximum and minimum element frequencies in an array
// Time: O(n) - frequency pass + pass over frequencies
// Space: O(u) - HashMap of unique elements

import java.util.HashMap;
import java.util.Map;

public class FrequencySum {
    public static int getFrequencySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Count the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        // Find the highest and lowest frequencies
        for (int freq : frequencyMap.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
            if (freq < minFreq) {
                minFreq = freq;
            }
        }

        // Return the sum of the max and min frequencies
        return maxFreq + minFreq;
    }
}
