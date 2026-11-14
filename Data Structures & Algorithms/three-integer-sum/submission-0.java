class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int target = -nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    List<Integer> valid = new ArrayList<>();
                    valid.add(nums[i]);
                    valid.add(nums[start]);
                    valid.add(nums[end]);
                    res.add(valid);
                    start++;
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                } else if (nums[start] + nums[end] > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return res;

        
    }
}
