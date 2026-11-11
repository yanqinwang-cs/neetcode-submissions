class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> table = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            if (!table.containsKey(a)) {
                table.put(a, 1);
            } else {
                int val = table.get(a) + 1;
                table.put(a, val);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            String b = String.valueOf(t.charAt(i));
            if (!table.containsKey(b)) {
                return false;
            } else if (table.get(b) == 1) {
                table.remove(b);
            } else {
                int val = table.get(b) - 1;
                table.put(b, val);
            }
        }

        return table.size() == 0;

    }
}
