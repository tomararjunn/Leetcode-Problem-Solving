class Solution {
    public int[][] transpose(int[][] matrix) {
        //for old array
        int orow=matrix.length;
        int ocol=matrix[0].length;

        // for new array
        int nrow=ocol;
        int ncol=orow;
        int [][] result=new int[nrow][ncol];
        for(int i=0;i<orow;i++){
            for(int j=0;j<ocol;j++){
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }
}