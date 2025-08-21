

import java.util.Arrays;

public class RowColMartix {
    public static void main(String[] args) {
        int arr[][]={
            {9,10,12,16},
            {19,22,28,32},
            {34,39,42,49},
            {55,60,62,69}
        }; 
        System.out.println(Arrays.toString(search(arr, 49)));
        
    }
    static int[] search(int [][]matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while (r<matrix.length&&c>=0) {
            if (matrix[r][c]==target) {
                return new int[]{r,c};
            }
            if (matrix[r][c]<target) {
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
