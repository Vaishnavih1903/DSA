class Solution {
    public boolean checkValidString(String s) {
        int min=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                max=max+1;
                min=min+1;
            }
            else if(ch==')'){
                min=min-1;
                max=max-1;
            }else{
                min=min-1;
                max=max+1;
            }
            if(max<0){
                return false;
            }
            min=Math.max(0,min);

            
        }
        return min==0;
    }
}