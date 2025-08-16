package BinaryQS;
//peak index in a montain array
public class Montain {
    public static void main(String[] args) {
         int[] arr = {0, 2, 4, 6, 5, 3, 1};  // mountain array

        int peakIndex = peakIndexInMountainArray(arr); //  call function
        System.out.println("Peak Index = " + peakIndex);
        System.out.println("Peak Value = " + arr[peakIndex]);
    }

    
    
    static  int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are in dec part
                //this will be and but check on left side
                //thats why end!=mid-1
                 end=mid;
                }else{
                    start=mid+1;
                }
        }
        //int the end,start ==end and pointing to hte largest number because of 2 checks
        //start and end ate alwayes trying to find max element in the above 2checks
        //hence,when they are pointing to just one elment,that is max one because that is what the check
    return start; 
    //return end and start are both same
    }
}

