//ORDER AGNOSTIC BINARY SEARCH
public class Order_Agnostic_BS {
    public static void main(String[] args) {
         int arr[]={2,3,4,6,8,12,16,18,21,26,32,38,42,59,62};
         int arr2[]={98,85,78,62,59,42,25,12,10,5,-1};
        int target=62;
        int result=binary2(arr, target);
        int result2=binary2(arr2, target);

        if(result!=-1||result2!=-1){
            System.out.printf("target found at index: "+result+"\n"+" In arr2 : " + result2);
        }
        else{
            System.out.println("target not found !!!");
        }
        
    }
    static int binary2(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isace=arr[start]<arr[end];

        while (start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid]==target) {
                return mid;   
            } 
            if (isace) {
                if (target<arr[mid]) {
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }
                //for desending order
            }else{
                 if (target>arr[mid]) {
                    end=mid-1;
                }else if(target<arr[mid]){
                    start=mid+1;
                }

            }
            
        }

        return -1;
    }
    
}

    

