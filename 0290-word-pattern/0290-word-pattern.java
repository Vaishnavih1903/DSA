class Solution {
    public boolean wordPattern(String p, String s) {
        String[]word=s.split(" ");
        if(word.length!=p.length()){
            return false;
        }
        HashMap<Character,String>map1=new HashMap<>();
        HashMap<String,Character>map2=new HashMap<>();
        for(int i=0;i<word.length;i++){
            char ch=p.charAt(i);
            String str=word[i];
            if(map1.containsKey(ch) && !map1.get(ch).equals(str)){
                return false;
            }
            if(map2.containsKey(str) &&  map2.get(str) != ch){
                return false;
            }
            map1.put(ch,str);
            map2.put(str,ch);

        }
        return true;

    }
}