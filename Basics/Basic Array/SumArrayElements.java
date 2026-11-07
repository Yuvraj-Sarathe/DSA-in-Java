//TODO: Find the sum of all elements of an array
// Time: O(n) - single accumulation pass
// Space: O(1) - only the sum variable

public class SumArrayElements {
    public  int sum(int arr[], int n) {
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
}
