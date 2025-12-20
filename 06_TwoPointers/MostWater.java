public class MostWater {
    public static void main(String[] args) {
        
    }
    static public int maxArea(int[] height) {
        int left=0;
        int right =height.length-1;
        int maxArea=0;
        while(left<right){ 
            int currSum=Math.min(height[left], height[right])*(left-right);
            maxArea=Math.max(maxArea, currSum);
            if (height[left]<height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

}

