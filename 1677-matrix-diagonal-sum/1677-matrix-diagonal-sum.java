class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int m=mat.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==m-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;   
    }
}