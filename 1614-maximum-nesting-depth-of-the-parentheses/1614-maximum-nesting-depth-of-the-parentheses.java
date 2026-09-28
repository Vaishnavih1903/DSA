class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int maxcounter=counter;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                counter++;
            }
            else if(ch==')'){
                counter--;
            }

            maxcounter=Math.max(counter,maxcounter);
        }
        return maxcounter;
    }
}