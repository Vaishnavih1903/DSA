class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i=0;
        int j=0;
        int n=arr.length;
        int[]best=new int[n];
        int currentsum=0;
        for(int num:best){
            num=Integer.MAX_VALUE;

        }
        int len=Integer.MAX_VALUE;
        int result=Integer.MAX_VALUE;
        while(j<n){
            currentsum=currentsum+arr[j];
            while(i<j && currentsum>target){
                currentsum=currentsum-arr[i];
                i++;

            }
            if(currentsum==target){
                int length=j-i+1;
                if(i>0 && best[i-1]!=Integer.MAX_VALUE){
                    result=Math.min(result,best[i-1]+length);

                }
                len=Math.min(len,length);
            }
            best[j]=len;
            j++;
        }
        if(result==Integer.MAX_VALUE){
            return -1;
        }else{
            return result;
        }

    }
}