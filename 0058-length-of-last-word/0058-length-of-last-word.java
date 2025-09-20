class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr=s.trim().split("\\s+");
        int len=arr.length;
        int lengthOfLast=arr[len-1].length();
        return lengthOfLast;
        
    }
}