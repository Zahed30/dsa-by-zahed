

public class SplitArrayLargestSum {
    public static void main(String[] args) {
         int[] nums = {7, 2, 5, 10, 8};
        int m = 2; // split into 2 subarrays
        int result = splitarray(nums, m);
        System.out.println("The minimum largest sum after splitting is: " + result);
        
    }
    static int splitarray(int nums[],int m){
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {//in the end of this loop this will contain max item in an array
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        //binary search
        while (start<end) {
            int mid=start+(end-start)/2;
            //calculate how many pieces can slpit the array
            int sum=0;
            int pieces=1;
            for (int num : nums) {
                if (sum+num>mid) {
                    //you cannot add in this subarray,make a new one
                    //say you add this num and in this new subarray ,then sum and num is same sum=num
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            if (pieces>m) {
                end=mid;
            }else{
                start=mid +1;
            }
        }
        return end;//end or start is same end==start

    }
    
}
