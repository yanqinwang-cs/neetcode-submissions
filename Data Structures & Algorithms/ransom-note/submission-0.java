class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] r = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            r[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            r[magazine.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (r[i] > 0) {
                return false;
            }
        }
        return true;

        
    }
}