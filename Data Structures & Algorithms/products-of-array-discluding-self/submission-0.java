class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n + 1];
        int[] suff = new int[n + 1];
        int[] res = new int[n];
        pref[0] = 1;
        suff[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            pref[i + 1] = pref[i] * nums[i];
            suff[i + 1] = suff[i] * nums[nums.length - i - 1];

        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = pref[i] * suff[nums.length - i - 1];
        }
        return res;

        
    }
}  
