/**
 * Problem: 238. Product of Array Except Self
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 * Time Complexity: O(n)
 * Space Complexity: O(1) (Result array not counted)
 */
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate Prefix products
        // result[i] will store product of all elements to the left of i
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply by Suffix products on the fly
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix *= nums[i]; // Update suffix for the next element to the left
        }

        return result;
    }
}