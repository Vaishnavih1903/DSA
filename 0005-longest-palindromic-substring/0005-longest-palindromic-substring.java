class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
               String sub=s.substring(i,j+1);
               if(ispal(sub) && ans.length()<sub.length()){
                  ans=sub;
               }
            }
        }
        return ans;
    }
    boolean ispal(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}