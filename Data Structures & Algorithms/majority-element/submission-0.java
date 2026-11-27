class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int m = nums.length/2;
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
            if (map.get(n) > m) {
                return n;
            }

        }
        return 0;
        
    }
}