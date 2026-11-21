class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            maxHeap.offer(nums[i]);
        }
        res[0] = maxHeap.peek();
        for (int l = 0; l < nums.length - k; l++) {
            int r = l + k;
            maxHeap.offer(nums[r]);
            maxHeap.remove(nums[l]);
            res[l + 1] = maxHeap.peek();
        }
        return res;
        
    }
}
