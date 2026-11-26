class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder(strs[0]);
        for (String s : strs) {
            StringBuilder at = new StringBuilder(s);
            if (at.length() > res.length()) {
                at.delete(res.length(), at.length());
            } else if (res.length() > at.length()) {
                res.delete(at.length(), res.length());
            }
            while (!at.toString().equals(res.toString())) {
                System.out.println(res + " " + at);
                res.deleteCharAt(res.length() - 1);
                at.deleteCharAt(at.length() - 1);
            }
        }
        return res.toString();

        
    }
}