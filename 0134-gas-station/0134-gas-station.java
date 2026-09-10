class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0;
        int tcost=0;
        int start=0;
        int curr=0;
        for(int i=0;i<gas.length;i++){
            tgas=tgas+gas[i];
            tcost=tcost+cost[i];
            curr=curr+(gas[i]-cost[i]);
            if(curr<0){
                start=i+1;
                curr=0;
            }

        }
        if(tgas<tcost){
            return -1;
        }
        return start;
    }
}