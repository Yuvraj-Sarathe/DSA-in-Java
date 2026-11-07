//TODO: Build a frequency array (index = value) for integers bounded in [0,12]
// Time: O(n) - single pass
// Space: O(13) - fixed-size counter array

// This method counts the occurrences of integers (bounded between 0 and 12) in the input array and returns their frequencies mapped by index.


public class NumberHashing{
    public int[] hashArray(int[] arr) {
        int[] hash = new int[13];
        for(int i=0; i<arr.length; i++){
            hash[arr[i]] += 1;
        }
        return hash;
    }
}