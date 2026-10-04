class Solution {
    public String frequencySort(String s) {
        int[]frq=new int[128];
        for(char ch:s.toCharArray()){
            frq[ch]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int f=s.length();f>=1;f--){
            for(int ch=0;ch<128;ch++){
               if(frq[ch]==f){
                for(int i=0;i<f;i++){
                    sb.append((char)ch);
                }
               }
            }
        }
        return sb.toString();
    }
}