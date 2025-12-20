// TrappingRainWater.java
// Two-pointer approach (O(n) time, O(1) space)
import java.util.Arrays;

public class TrappingRainWater {
    // LeetCode-style signature
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) leftMax = height[left];
                else ans += leftMax - height[left];
                left++;
            } else {
                if (height[right] >= rightMax) rightMax = height[right];
                else ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }

    // Simple main for testing
    public static void main(String[] args) {
        TrappingRainWater solver = new TrappingRainWater();
        int[] h1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("height: " + Arrays.toString(h1));
        System.out.println("trapped water = " + solver.trap(h1)); // expected 6

        int[] h2 = {4,2,0,3,2,5};
        System.out.println("height: " + Arrays.toString(h2));
        System.out.println("trapped water = " + solver.trap(h2)); // expected 9
    }
}
