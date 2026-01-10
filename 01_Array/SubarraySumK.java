import java.util.HashMap;

/**
 * Problem: 560. Subarray Sum Equals K
 * Link: https://leetcode.com/problems/subarray-sum-equals-k/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class SubarraySumK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        // Map to store: <PrefixSum, Frequency>
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: If currentSum equals k, (currentSum - k) is 0.
        map.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) exists in map, add its frequency to count
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            // Store/Update the frequency of the current prefix sum
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}