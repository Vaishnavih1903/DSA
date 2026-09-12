class Solution {
    public int totalNumbers(int[] digits) {
        int[]frq=new int[10];
        int count=0;
        for(int dig:digits){
            frq[dig]++;
        }
        for(int a=1;a<=9;a++){
            for(int b=0;b<=9;b++){
                for(int c = 0; c <= 8; c += 2){
                   frq[a]--;
                   frq[b]--;
                   frq[c]--;

                   if(frq[a]>=0 && frq[b]>=0 && frq[c]>=0){
                    count++;
                   }
                    frq[a]++;
                    frq[b]++;
                    frq[c]++;

                   
                }

            }
        }
        return count;
    }
}