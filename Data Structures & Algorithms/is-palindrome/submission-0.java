class Solution {
    public boolean isPalindrome(String s) {
        
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int b = result.length() - 1;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != result.charAt(b)) {
                return false;
            }
            b--;
        }
        return true;
        
    }
}
