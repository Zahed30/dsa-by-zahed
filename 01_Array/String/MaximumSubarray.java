/**
 * Problem: 53. Maximum Subarray (Kadane's Algorithm)
 * Link: https://leetcode.com/problems/maximum-subarray/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            // If current sum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}