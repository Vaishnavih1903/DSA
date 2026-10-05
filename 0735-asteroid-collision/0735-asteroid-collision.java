class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s=new Stack<>();
        for(int ast:asteroids){
            boolean isalive=true;
            while(isalive && ast<0 && !s.isEmpty() && s.peek()>0){
                if(s.peek()<Math.abs(ast)){
                    s.pop();
                }else if(s.peek()==Math.abs(ast)){
                    s.pop();
                    isalive=false;
                }else{
                    isalive=false;
                }
            }
            if(isalive){
                s.push(ast);
            }

        }
        int[] ans=new int[s.size()];
        for(int i=0;i<s.size();i++){
            ans[i]=s.get(i);
        }
        return ans;
    }
}