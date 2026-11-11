class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> table1 = new HashMap<>();
        HashMap<Character, Integer> table2 = new HashMap<>();
        

        for (int i = 0; i < s.length(); i++) {
            table1.put(s.charAt(i), table1.getOrDefault(s.charAt(i), 0) + 1);
            table2.put(t.charAt(i), table2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return table1.equals(table2);


    }
}
