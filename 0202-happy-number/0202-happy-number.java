
import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen= new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n=cycle(n);

        }
        return n==1;

       
    }
    private int cycle(int num){
        int sum=0;
        while(num>0){
            int rem1=num%10;
            int re2=rem1*rem1;
            sum=sum+re2;
            num=num/10;
        }
        return sum;
    }
}