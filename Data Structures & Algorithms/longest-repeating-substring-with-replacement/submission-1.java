class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int longest = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int maxf = 0;

        for (int r = 0; r < s.length(); r++) {
            freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, freq.get(s.charAt(r)));
            while (r - l + 1 - maxf > k) {
                freq.computeIfPresent(s.charAt(l), (key, val) -> val > 1 ? val - 1 : null);
                l++;
            }
            longest = Math.max(longest, r - l + 1);


        }
        return longest;

        
    }
}
