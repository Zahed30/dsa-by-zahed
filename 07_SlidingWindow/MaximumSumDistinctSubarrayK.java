// File: MaximumSumDistinctSubarrayK.java
// Problem: Maximum sum of distinct subarrays with length K
// Author: Zahed Hussain

import java.util.HashSet;
import java.util.Set;

public class MaximumSumDistinctSubarrayK {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        long ans = maximumSubarraySum(nums, k);
        System.out.println("Maximum sum of distinct subarray of length " + k + " = " + ans);
        // Expected output: 15 (subarray [5,4,2] or [4,2,9])
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long windowSum = 0;
        long maxSum = 0;
        Set<Integer> set = new HashSet<>();

        for (int right = 0; right < nums.length; right++) {
            // Ensure all elements remain distinct
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            windowSum += nums[right];

            // When window size reaches k, check and slide
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                // Slide forward
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
