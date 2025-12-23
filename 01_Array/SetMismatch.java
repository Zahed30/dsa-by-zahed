/**
 * Problem: 645. Set Mismatch
 * Link: https://leetcode.com/problems/set-mismatch/
 * Time Complexity: O(n)
 * Space Complexity: O(n) - using a frequency array
 */
public class SetMismatch {
     public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        int freq[]=new int[n+1];

        int duplicate = -1;
        int missing = -1;
        
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]==2){
                duplicate=nums[i];
            }
        }
        for(int i=1;i<=n;i++){
            if(freq[i] == 0){
                missing=i;
                break;
            }
        }
        return new int[]{duplicate,missing};
    }
    
}