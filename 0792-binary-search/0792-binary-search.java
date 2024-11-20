class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int sp=0;
        int ep=n-1;
        while(sp<=ep){
            int mid=sp+((ep-sp)/2);
            if(target>nums[mid]){
                sp=mid+1;
            }
            else if(target<nums[mid]){
                ep=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
        
    }
}