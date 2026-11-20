class Solution {
    public String minWindow(String s, String t) {
        if (t.equals("")) {
            return "";
        }
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int have = 0;
        int[] res = new int[]{-1, -1};
        int resLen = Integer.MAX_VALUE;
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int need = tMap.size();

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tMap.containsKey(c) && window.get(c).equals(tMap.get(c))) {
                have++;
            }

            while (have == need) {
                if ((right - left + 1) < resLen) {
                    resLen = right - left + 1;
                    res[0] = left;
                    res[1] = right;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (tMap.containsKey(leftChar) && window.get(leftChar) < tMap.get(leftChar)) {
                    have--;
                }
                left++;
            }

        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);

        
    }
}
