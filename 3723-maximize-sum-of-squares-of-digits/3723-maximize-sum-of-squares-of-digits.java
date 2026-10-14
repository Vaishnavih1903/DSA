class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans=new StringBuilder();
        if(sum>9*num){
            return "";
        }
        for(int i=0;i<num;i++){
            int digit=Math.min(9,sum);
            ans.append(digit);
            sum-=digit;

        }
        return ans.toString();
    }
}