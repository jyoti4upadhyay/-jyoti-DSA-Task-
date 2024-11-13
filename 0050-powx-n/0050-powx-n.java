class Solution {
    public double myPow(double x, int n) {
        int n1=Math.abs(n);
        double result=pow(x,n1);
        if(n<0){
            return 1/result;
        }
        else {
            return result;
        }
    }
    public double pow(double x,int n1){
        if(n1==0){
            return 1;
        }
        double temp=pow(x,n1/2);
        if(n1%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*x;
        }
    }
}