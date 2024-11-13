class Solution {
    public boolean isPalindrome(String s) {
        
        int sp=0;
        int ep=s.length()-1;
        s=s.toLowerCase();
        while(sp<ep){
            char x=s.charAt(sp);
            char y=s.charAt(ep);
            if(!(x>='a' && x<='z') && !(x>='0' && x<='9')){
                sp++;
                continue;
            }
            if(!(y>='a' && y<='z') && !(y>='0' && y<='9')){
                ep--;
                continue;
            }
            if(x!=y){
                return false;
            }
            sp++;
            ep--;

        }
        return true;
   

    }
}