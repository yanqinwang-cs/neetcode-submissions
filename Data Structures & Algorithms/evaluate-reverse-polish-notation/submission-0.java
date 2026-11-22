class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        Map<String, java.util.function.BinaryOperator<Integer>> operators = new HashMap<>(Map.of(
            "+", (x, y) -> x + y,
            "-", (x, y) -> x - y,
            "*", (x, y) -> x * y,
            "/", (x, y) -> x / y
        ));
        if (tokens.length == 0) {
            return 0;
        }
        for (String t : tokens) {
            if (!operators.containsKey(t)) {
                stack.push(Integer.valueOf(t));
            } else {
                int y = stack.pop();
                int x = stack.pop();
                java.util.function.BinaryOperator<Integer> op = operators.get(t);
                int res = op.apply(x, y);
                stack.push(res);
            }

        }
        return stack.pop();
        
    }
}
