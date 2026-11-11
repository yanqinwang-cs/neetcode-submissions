class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List> each = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            if(!each.containsKey(sorted)) {
                each.put(sorted, new ArrayList<>(List.of(s)));
            } else {
                each.get(sorted).add(s);
            }
        }

        for (List<String> s : each.values()) {
            res.add(s);
        }
        return res;



        
    }
}
