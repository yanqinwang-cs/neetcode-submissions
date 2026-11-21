class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.add(curr);
            } else if (curr == ')') {
                if (stack.size() == 0 || stack.get(stack.size() - 1) != '(') {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }
            } else if (curr == '}') {
                if (stack.size() == 0 || stack.get(stack.size() - 1) != '{') {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }
            } else if (curr == ']') {
                if (stack.size() == 0 || stack.get(stack.size() - 1) != '[') {
                    return false;
                } else {
                    stack.remove(stack.size() - 1);
                }

            }

        }




        return stack.size() == 0;
        
    }
}
