class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, List<Integer>> map = new HashMap<>();
        Map<Character, List<Integer>> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.get(s.charAt(i)).add(i);
            } else {
                map.put(s.charAt(i), new ArrayList<Integer>(List.of(i)));
            }
            if (map2.containsKey(t.charAt(i))) {
                map2.get(t.charAt(i)).add(i);
            } else {
                map2.put(t.charAt(i), new ArrayList<Integer>(List.of(i)));
            }
        }
        return new HashSet<>(map.values()).equals(new HashSet<>(map2.values()));
        
    }
}