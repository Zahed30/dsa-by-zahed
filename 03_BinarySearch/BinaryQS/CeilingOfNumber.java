
//celing of the number 

public class CeilingOfNumber {
    public static void main(String[] args) {
        
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        int result=ceiling1(arr, target);
        System.out.println(result);
    }
// return the index of smallest no>=target
static int ceiling1(int arr[],int target){
    if (target>arr[arr.length - 1]) {
        return -1;        
    }
    int start=0;
    int end=arr.length-1;

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
    return start;

}
}
