class Solution {
    public void rotate(int[][] matrix) {
        //isko apprch dekhte h 1) iska transpose krdo toh row will become col then 2) reverse krdo
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // 1-Transpose the matrix
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // 2) Reverse the matrix 
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            left++;
           
              right--;
            }
        }
    }
}