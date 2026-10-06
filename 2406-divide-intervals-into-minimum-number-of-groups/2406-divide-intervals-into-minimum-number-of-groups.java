class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b) ->a[0]-b[0]);
        for(int[] inter:intervals){
            int start=inter[0];
            int end=inter[1];
            if(!pq.isEmpty() && pq.peek()<start){
                pq.poll();
            }
            pq.add(end);

        }
        return pq.size();
    }
}