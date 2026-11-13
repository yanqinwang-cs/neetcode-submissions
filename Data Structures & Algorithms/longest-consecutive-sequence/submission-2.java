class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if (!s.contains(nums[i] - 1)) {
                int locMax = 1;
                int curr = nums[i];
                while (s.contains(curr + 1)) {
                    curr++;
                    locMax++;
                }
                if (locMax > max) {
                    max = locMax;
                }




            }

        }
        return max;
        
    }
}
