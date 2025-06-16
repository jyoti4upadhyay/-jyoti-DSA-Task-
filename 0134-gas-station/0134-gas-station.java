class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int totalgas=0;
        int totalcost=0;
        int current_tank=0;
        int start=0;
        for(int i=0;i<n;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            current_tank += (gas[i]-cost[i]);
            if(current_tank<0){
                start=i+1;
                current_tank=0;
            }
            
        }
        return (totalgas>=totalcost)?start:-1;

        
    }
}
