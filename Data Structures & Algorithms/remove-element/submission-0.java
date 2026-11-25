class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] != val) {
                res++;
            }
        }
        int next = 0;

        for (int i = 0; i < res; i++) {
            next++;
            if (nums[i] == val) {
                while (nums[next] == val) {
                    next++;
                }
                int tmp = nums[next];
                nums[next] = nums[i];
                nums[i] = tmp;
            }

        }
        

        return res;
        
    }
}