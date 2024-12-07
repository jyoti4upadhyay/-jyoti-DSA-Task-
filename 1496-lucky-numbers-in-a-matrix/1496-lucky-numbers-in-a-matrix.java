class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int ind=0;
        int k;
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    ind=j;
                }
            }
            for(k=0;k<matrix.length;k++){
                if(matrix[k][ind]>min){
                   break;
                }
            }
            if(k==matrix.length){
                ans.add(min);
            }
        }
        return ans;


    }
}