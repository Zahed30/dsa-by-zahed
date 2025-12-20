import java.util.Arrays;

public class SquareSorted {
    public static void main(String[] args) {
        int nums[]={-4, -1, 0, 3, 10};
        // solution(nums);
        System.out.println(Arrays.toString(solution(nums)));
        
        
    }   
    static int[] solution(int nums[]){
        int left=0;
        int right=nums.length-1;
        int pos=nums.length-1;//points on largest value to be store
        int []result=new int[nums.length];

        while (left<=right) {//check all the element
            if (Math.abs(nums[left])>=Math.abs(nums[right])) {//take abslute value
                int Square=nums[left]*nums[left];
                result[pos]=Square;//store the value of square
                left++;
            }else{
                int Square=nums[right]*nums[right];
                result[pos]=Square;
                right--;
            }
            pos--;//because we are placing it from backward side
            
        }
        return result;
    } 
}

