public class BinarySearch {
    public static void main(String[] args) {
  int arr[]={2,3,4,6,8,12,16,18,21,26,32,38,42,59,62};//in order
        int target=32;
        int result=searchb(arr, arr.length, target);

        if(result!=-1){
            System.out.println("target found at index:"+result);
        }
        else{
            System.out.println("target not found !!!");
        }
        
    }
    static int searchb(int []arr,int n,int target){
        int low=0;
        int high=arr.length-1;//n-1
        while (low<=high) {
            int mid=(low+high)/2;
            if (target<arr[mid]) {
                high=mid-1;
            }else if(target>arr[mid]){
                low=mid+1;

            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
    

    }
 


