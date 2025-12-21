public class InfinateNumber {
    public static void main(String[] args) {
        int []nums={1,3,5,6,8,11,21,26,30,32,35,38,41,49,52,56,58,60};
        int target=41;
        System.out.println(ans(nums, target));
    }
    static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while (target>arr[end]) {
            int newstart=end+1;
            end=end+(start-end+1)*2;
            start=newstart;

        }
        return search(arr, target, start, end);
    }
    static int search(int arr[],int target,int start,int end){
    while (start<=end) {
        //find the middle element
        int mid=start+(end-start)/2;
        
        //check the condition
        if (target<arr[mid]) {
            end=mid-1;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            //ans found
            return mid;
        }
        
    }
    // return start 
    return -1;

}
    
}
