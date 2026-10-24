class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start=Math.max(convert(arriveAlice),convert(arriveBob));
        int end=Math.min(convert(leaveAlice),convert(leaveBob));

        return Math.max(end-start+1,0);
    }
    int convert(String str){
        int month=Integer.parseInt(str.substring(0,2));
        int day=Integer.parseInt(str.substring(3,5));

        int[] days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total=day;
        for(int i=0;i<month-1;i++){
            total+=days[i];

        }
        return total;
    }
}