/**
 * Problem: 724. Find Pivot Index
 * Link: https://leetcode.com/problems/find-pivot-index/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class PivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for (int x : nums) totalSum += x;
        
        for (int i = 0; i < nums.length; i++) {
            // Logic: totalSum - leftSum - currentElement = rightSum
            if (leftSum == totalSum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}