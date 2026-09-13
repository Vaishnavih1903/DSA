class StockSpanner {

    Stack<Integer> s;
    ArrayList<Integer> prices;

    public StockSpanner() {
        s = new Stack<>();
        prices = new ArrayList<>();
    }

    public int next(int price) {

        int i = prices.size();

        while (!s.isEmpty() && prices.get(s.peek()) <= price) {
            s.pop();
        }

        int span;

        if (s.isEmpty()) {
            span = i + 1;
        } else {
            span = i - s.peek();
        }

        prices.add(price);
        s.push(i);

        return span;
    }
}