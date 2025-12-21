

public class FloorOfNumber {
    public static void main(String[] args) {
        
        int arr[]={2,3,5,9,14,16,18};
        int target=15;
        int result=floor1(arr, target);
        System.out.println(result);
    }
// return the index of greatest number<=target
static int floor1(int arr[],int target){
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
    // return end value
    return end;

}
}

    

