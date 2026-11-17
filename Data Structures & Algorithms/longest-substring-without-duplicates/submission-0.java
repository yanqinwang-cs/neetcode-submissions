class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int l = 0;
        int max = 0;
        for (int r = 0; r < s.length(); r++) {
            char current = s.charAt(r);

            while (window.contains(current)) {
                window.remove(s.charAt(l));
                l++;
            }

            window.add(current);
            max = Math.max(max, r - l + 1);

            
        }
        return max;
        
    }
}
