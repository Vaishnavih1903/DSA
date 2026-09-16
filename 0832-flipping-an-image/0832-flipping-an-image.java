class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[]a:image){
            reverse(a);
            convert(a);
        }
        return image;
    }
    private void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    private void convert(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
}