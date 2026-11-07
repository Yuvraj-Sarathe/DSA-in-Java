//TODO: Find the element with the second-highest frequency in an array
// Time: O(n) - one frequency pass + one scan over map values
// Space: O(u) - HashMap of unique elements

import java.util.HashMap;
import java.util.Map;

public class Freq_of_2nd_Most_Element {
    public static int getSecondMostFrequent(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        // Count frequencies of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Track the highest and second highest frequencies
        int highestFreq = 0;
        int secondHighestFreq = 0;

        for (int freq : frequencyMap.values()) {
            if (freq > highestFreq) {
                secondHighestFreq = highestFreq;
                highestFreq = freq;
            } else if (freq > secondHighestFreq && freq < highestFreq) {
                secondHighestFreq = freq;
            }
        }

        // If no second highest frequency exists (e.g., all elements have the same frequency)
        if (secondHighestFreq == 0) {
            return -1;
        }

        // Smallest element with the second highest frequency
        int resultElement = Integer.MAX_VALUE;
        boolean found = false;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == secondHighestFreq) {
                if (entry.getKey() < resultElement) {
                    resultElement = entry.getKey();
                    found = true;
                }
            }
        }

        return found ? resultElement : -1;
    }
}
