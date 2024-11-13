class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxsum=Integer.MIN_VALUE;
        int arrsum=0;
        for(int i=0;i<n;i++){
            arrsum=arrsum+nums[i];
            if(arrsum>maxsum){
                maxsum=arrsum;
            }
            if(arrsum<0){
                arrsum=0;
            }
        }
        return maxsum;
        
    }
}