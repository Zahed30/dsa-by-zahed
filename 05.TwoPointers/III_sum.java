import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class III_sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = threeSum(nums);
        System.out.println(res);
        

    }

    static public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null||nums.length<3) {//check the cases
            return new ArrayList<>();
        }
        Arrays.sort(nums);//sort the array
        Set<List<Integer>> result = new HashSet<>();

        //fix the first element 
        for (int i = 0; i < nums.length-2; i++) {
            //two pointers 
            int left=i+1;//cuz we have fix the first element
            int right=nums.length-1;

            while (left<right) {
                int sum=nums[i]+nums[left]+nums[right];
                if (sum==0) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return new ArrayList<>(result);
    }
}
