class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> diff = new HashMap<>();
        int res = 0;
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else {
                ones++;
            }
            if (!diff.containsKey(ones - zeros)) {
                diff.put(ones - zeros, i);
            }
            if (ones == zeros) {
                res = ones + zeros;
            } else {
                int idx = diff.get(ones - zeros);
                res = Math.max(i - idx, res);
            }
        }
        return res;



    }
}
