import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        
        int newLength = removeDuplicates(nums); 
        
        // Print only the unique part of the array
        int[] unique = Arrays.copyOf(nums, newLength);
        System.out.println(Arrays.toString(unique));
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) 
        return 0;

        int left = 1; // pointer for placing unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[left - 1]) {
                nums[left] = nums[i];
                left++;
            }
        }
        return left; // number of unique elements
    }
}
