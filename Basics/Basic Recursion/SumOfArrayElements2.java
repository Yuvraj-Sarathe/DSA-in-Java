//TODO: Given an array nums, find the sum of elements of array using recursion.

public class SumOfArrayElements2 {
    public int arraySum(int[] nums) {
        return sum(nums, 0);
    }

    int sum(int[] nums, int index){
        if(index >= nums.length){
            return 0;
        }
        return nums[index] + sum(nums, index+1);
    }
}
