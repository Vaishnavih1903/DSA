class StockSpanner {
    Stack<Integer>s;
    ArrayList<Integer>p;

    public StockSpanner() {
        s=new Stack<>();
        p=new ArrayList<>();
        
    }
    
    public int next(int price) {
        int i=p.size();
        while(!s.isEmpty() && p.get(s.peek())<=price){
            s.pop();
        }
        int span;
        if(s.isEmpty()){
            span=i+1;

        }else{
            span=i-s.peek();
        }
        p.add(price);
        s.push(i);
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */