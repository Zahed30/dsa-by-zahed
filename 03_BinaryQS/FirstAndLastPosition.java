
//First and last position in an given array
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10};
        int target=8;
        int[] ans = searchrange(nums, target);
        System.out.println(ans[0] +" "+ans[1]);
        // System.out.println("Last position: " + ans[1]);
    }
    static public int[]searchrange(int[]nums,int target){
        int[]ans={-1,-1};
        int start=search(nums, target, true);
        int end=search(nums, target, false);

        ans [0]=start;
        ans[1]=end;
        return ans; 
    }
    //this function just return the index value of the target
    static int search(int nums[],int target,boolean findStartindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

         while (start<=end) {
        //find the middle element
        int mid=start+(end-start)/2;
        
        //check the condition
        if (target<nums[mid]) {
            end=mid-1;
        }
        else if(target>nums[mid]){
            start=mid+1;
        }
        else{
            //potential ans is found
            ans =mid;
        
            if (findStartindex) {
                end=mid-1;
            }else{
                start=mid+1;
            }
         }
    }
    

    return ans;

}
    
}