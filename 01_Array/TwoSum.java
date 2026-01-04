import java.util.HashMap;

/**
 * Problem: 1. Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 */
class TwoSum {
    // 1. Brute Force Approach - O(n^2) Time | O(1) Space
    public int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    // 2. Optimized Approach (HashMap) - O(n) Time | O(n) Space
    static public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int needed = target - current;

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(current, i);
        }

        return new int[]{};
    }
}

