// File: MaximumAverageSubarrayI.java
// LeetCode 643 – Maximum Average Subarray I
// Author: Zahed Hussain
// Description: Finds the maximum average of any contiguous subarray of size k.

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = findMaxAverage(nums, k);
        System.out.println("Maximum Average = " + result); // Expected: 12.75
    }
    // Core function using sliding window
    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        // Initial window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        // Return average as double
        return (double) maxSum / k;
    }

}

