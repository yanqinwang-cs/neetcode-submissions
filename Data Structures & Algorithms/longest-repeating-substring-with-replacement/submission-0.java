class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int longest = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);
            while (r - l + 1 - Collections.max(freq.values()) > k) {
                freq.computeIfPresent(s.charAt(l), (key, val) -> val > 1 ? val - 1 : null);
                l++;
            }
            longest = Math.max(longest, r - l + 1);


        }
        return longest;

        
    }
}
