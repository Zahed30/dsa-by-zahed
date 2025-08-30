public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // swap nums[i] with nums[nonZeroIndex]
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;

                nonZeroIndex++;
            }
        }
    }
}
