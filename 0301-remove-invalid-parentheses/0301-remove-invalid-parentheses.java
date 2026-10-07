class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String>ans=new ArrayList<>();
        Set<String>set=new HashSet<>();
        Queue<String>q=new LinkedList<>();
        q.add(s);
        set.add(s);
        boolean found = false;
        while(!q.isEmpty()){
            String sub=q.remove();
            if(isvalid(sub)){
                ans.add(sub);
                found=true;
            }
            if(found){
                continue;
            }

            for(int i=0;i<sub.length();i++){
                if(sub.charAt(i)!='(' && sub.charAt(i)!=')'){
                    continue;
                }
                String next=sub.substring(0,i)+sub.substring(i+1);
                if(set.add(next)){
                    q.add(next);
                }
            }
        }
        return ans;
    }

    boolean isvalid(String s){
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                cnt++;
            }else if(ch==')'){
                cnt--;
            }
            if(cnt<0){
                return false;
            }
        }
        return cnt==0;
    }
}