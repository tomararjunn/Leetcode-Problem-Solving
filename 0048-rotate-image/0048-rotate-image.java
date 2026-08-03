class Solution {
    public void rotate(int[][] matrix) {
        //step1 transpose
        //step2 reverse
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
        //reverse
         for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
         }
    }
}