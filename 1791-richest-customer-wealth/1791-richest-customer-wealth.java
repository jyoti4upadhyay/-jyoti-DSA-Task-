class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int row=0; row<accounts.length;row++){
            for(int col=0;col<accounts[row].length;col++){
                sum=sum+accounts[row][col];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
        }
        return max;

        
    }
}