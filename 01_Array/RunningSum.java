/**
 * Problem: 1480. Running Sum of 1D Array
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/
 * Time Complexity: O(n)
 * Space Complexity: O(1) (modifying input array)
 */
class RunningSum {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1]; // Prefix sum logic
        }
        return nums;
    }
}