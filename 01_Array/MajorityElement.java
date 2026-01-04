import java.util.HashMap;

/**
 * Problem: 169. Majority Element
 * Link: https://leetcode.com/problems/majority-element/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // update count
            map.put(num, map.getOrDefault(num, 0) + 1);

            // check majority
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        // problem guarantees majority element exists
        return -1;
    }
}