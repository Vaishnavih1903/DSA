class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char bh = t.charAt(i);

            if(map1[ch] != map2[bh]){
                return false;
            }

            map1[ch] = i + 1;
            map2[bh] = i + 1;
        }

        return true;
    }
}