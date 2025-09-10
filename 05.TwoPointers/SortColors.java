// SortColors.java
// One-pass Dutch National Flag algorithm (in-place)
import java.util.Arrays;

public class SortColors {
    // LeetCode-style signature
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high--);
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }

    // Simple main for testing
    public static void main(String[] args) {
        SortColors solver = new SortColors();

        int[] arr1 = {2,0,2,1,1,0};
        System.out.println("Before: " + Arrays.toString(arr1));
        solver.sortColors(arr1);
        System.out.println("After:  " + Arrays.toString(arr1));

        int[] arr2 = {2,0,1};
        System.out.println("Before: " + Arrays.toString(arr2));
        solver.sortColors(arr2);
        System.out.println("After:  " + Arrays.toString(arr2));
    }
}
