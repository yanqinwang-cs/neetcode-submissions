class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> min;

    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.min = new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
        if (this.min.isEmpty()) {
            this.min.push(val);
        } else {
        this.min.push(Math.min(val, this.min.peek()));
        }
    }
    
    public void pop() {
        this.stack.pop();
        this.min.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.min.peek();
        
    }
}
