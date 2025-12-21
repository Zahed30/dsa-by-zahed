import java.util.HashSet;

/**
 * Problem: 217. Contains Duplicate
 * Link: https://leetcode.com/problems/contains-duplicate/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class FindDuplicate {
    class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return true; // Duplicate found
                }
                set.add(num);
            }
            return false;
        }
    }

}
