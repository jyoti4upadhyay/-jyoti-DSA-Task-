class Solution {
    public int[] replaceElements(int[] arr) {
        int[] output=new int[arr.length];
        Arrays.fill(output,-1);
        for(int i=0;i<arr.length-1;i++){
            int max=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                if(max>arr[j]){ 
                    output[i]=max;
                }
                else{
                    max=arr[j];
                    output[i]=max;
                }
        
            }
        }
        return output;
    }
}