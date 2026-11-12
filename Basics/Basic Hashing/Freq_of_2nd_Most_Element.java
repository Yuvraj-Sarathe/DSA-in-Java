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

        // TODO: Find the element with the second-highest frequency in an array
        int maxFreq = 0, secondFreq = 0;
        int maxEle = -1, secondEle = -1;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int ele = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                secondFreq = maxFreq;
                secondEle = maxEle;
                maxFreq = freq;
                maxEle = ele;
            } else if (freq > secondFreq) {
                secondFreq = freq;
                secondEle = ele;
            } else if (freq == secondFreq) {
                if (secondEle == -1 || ele < secondEle) {
                    secondEle = ele;
                }
            }
        }

        // If no second highest frequency exists (e.g., all elements have the same frequency)
        return secondFreq == 0 ? -1 : secondEle;
    }
}
