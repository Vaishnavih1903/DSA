class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m=logs.length;
        Arrays.sort(logs,(a,b) -> a[1]-b[1]);
        int q=queries.length;
        int[][]sq=new int[q][2];
        for(int i=0;i<q;i++){
            sq[i][0]=queries[i];
            sq[i][1]=i;

        }
        Arrays.sort(sq,(a,b) -> a[0]-b[0]);
        int[]ans=new int[q];
        Map<Integer,Integer>map=new HashMap<>();
        int i=0;
        int j=0;

        for(int[]pair:sq){
            int currtime=pair[0];
            int idx=pair[1];
            int start=currtime-x;
            int end=currtime;

            while(j<m && logs[j][1]<=end){
                int serverid=logs[j][0];
                map.put(serverid,map.getOrDefault(serverid,0)+1);
                j++;
            }
            while(i<j && logs[i][1]<start){
                int serverid=logs[i][0];
                map.put(serverid,map.get(serverid)-1);
                if(map.get(serverid)==0){
                    map.remove(serverid);
                }
                i++;
            }

            int count=map.size();
            ans[idx]=n-count;

        }
        return ans;
    }
}