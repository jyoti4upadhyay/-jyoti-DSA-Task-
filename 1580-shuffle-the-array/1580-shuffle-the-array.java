class Solution {
    public int[] shuffle(int[] nums, int n){
        int[] arr=new int[2*n];
        int i=0;
        int j=n+i;
        for(int k=0;k<2*n;k=k+2){
            if(i<j){
                arr[k]=nums[i];
                arr[k+1]=nums[j];
                i++;
                j++;
            }

        }
        return arr;
    }
}