public class LinearSearch {
    public static void main(String[] args) { 
        int[]num={5,6,58,74,62,-2,7,21,6,-8};
        int target=74;
        int ans=search(num, target);
        System.out.println(ans);
    }
    //search for elemet if its found return the index 
    //else return -1
    static int search(int[]arr,int target){
        if (arr.length==0) {
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int elemet=arr[i];
            if (elemet==target) {
                return i;
            }
            
        }
        //if target is not found it return this
        return -1;
    }
}
