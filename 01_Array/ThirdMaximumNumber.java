/**
 * Problem: 414. Third Maximum Number
 * Link: https://leetcode.com/problems/third-maximum-number/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second || num == third) continue;

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        // If third max doesn't exist, return the first max
        return (third == Long.MIN_VALUE) ? (int) first : (int) third;
    }
}