/**
 * Problem: 268. Missing Number
 * Link: https://leetcode.com/problems/missing-number/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MissingNum {
    public int missingNumber(int[] nums){
        int n=nums.length;
        boolean seen[]=new boolean[n+1];

        for (int i = 0; i < nums.length; i++) {
            seen[nums[i]]=true;
        }
        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                return i;
                
            }
            
        }

        return -1;
    }
    
}