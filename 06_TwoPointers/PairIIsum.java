import java.util.Arrays;

public class PairIIsum {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=26;
        System.out.println(Arrays.toString(pairsum(arr, target)));
        
    }
    static int[] pairsum(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            int sum=arr[left]+arr[right];
            if (sum==target) {
                return new int[]{left,right};
            }else if (sum<target) {
                left ++;
            }else{
                right--;
            }
        }
        return null;
    }
    
}

