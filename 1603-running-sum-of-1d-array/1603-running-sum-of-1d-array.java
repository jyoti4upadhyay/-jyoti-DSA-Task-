class Solution {
    public int[] runningSum(int[] nums) {
        int runsum=0;
        int[] runningSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            runsum=runsum+nums[i];
            runningSum[i]=runsum;
        }
        return runningSum;
    }
}