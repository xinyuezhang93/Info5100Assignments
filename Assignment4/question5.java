package Assignment4;

import java.util.Arrays;

public class question5 {
    public static void rotate(int[][] matrix) {
        if (matrix.length == 0){
            return;
        }
        int n = matrix.length;
        for(int i = 0; i < n/2; i++){
            for (int j = i; j < n-i-1; j++){
                int cur = matrix[i][j];
                int x = i;
                int y = j;              
                for (int k = 0; k < 4; k++){
                    int temp;
                    temp = matrix[y][n-x-1];
                    matrix[y][n-x-1] = cur;
                    cur = temp;
                    temp = x;
                    x = y;
                    y = n - temp - 1;
                }
            }           
        }                       
    }
    
    public static void main(String arg[]) {
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(input);
		System.out.print(Arrays.deepToString(input));	
	}
}
 
