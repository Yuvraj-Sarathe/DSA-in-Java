//TODO: Find the highest and lowest frequency elements in an array
// Time: O(n) - one frequency pass + one pass over map entries
// Space: O(u) - HashMap of unique elements

/*
! Problem Statement: Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
*/

import java.util.*;

public class Frequency_of_most_frequent_element {

    public int[] findFrequency(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        int maxEle = arr[0], minEle = arr[0];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) { 
                maxFreq = count; 
                maxEle = element; 
            }
            if (count < minFreq) { 
                minFreq = count; 
                minEle = element; 
            }
        }

        // Returns an array containing {maxElement, minElement}
        return new int[] { maxEle, minEle };
    }
}
