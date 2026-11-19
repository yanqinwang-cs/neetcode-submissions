class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int[] count = new int[26];
        int window = s1.length();
        int[] s2count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count, s2count)) {
            return true;
        }
        
        for (int left = 0; left < s2.length() - window; left++) {
            int right = left + window;
            s2count[s2.charAt(left) - 'a']--;
            s2count[s2.charAt(right) - 'a']++;
            if (Arrays.equals(count, s2count)) {
                return true;
            }
        }
        return false;

        
    }
}
