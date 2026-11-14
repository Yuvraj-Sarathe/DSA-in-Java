//TODO: Print the frequency of each distinct element of an array (HashMap counting)
// Time: O(n) - single pass with merge()
// Space: O(u) - HashMap of unique elements

//! Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

import java.util.*;

public class Frequency_of_each_element_in_the_array {
    public Map<Integer, Integer> getFrequencies(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
        }
        
        return map;
    }
}