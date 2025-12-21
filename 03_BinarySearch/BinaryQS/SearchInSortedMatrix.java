

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // System.out.println(searchbs(matrix, 11));
        System.out.println(Arrays.toString(searchbs(matrix, 11)));
        
    }
    static int[] searchbs(int matrix[][],int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        
        int start=0;
        int end=rows*cols-1;

        while (start<=end) {
            int mid=start+(end-start)/2;

            int row=mid/cols;
            int col=mid%cols;

            if (matrix[row][col]==target) {
                return new int[]{row,col};    
            }
            else if(matrix[row][col]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    
}
