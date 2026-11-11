class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> table = new HashMap<>();
        List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int i : nums) {
            table.put(i, table.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }

        int[] res = new int[k];
        int idx = 0;
        for (int i = nums.length; i >= 0 && idx < k; i--) {
            for (int num : buckets.get(i)) {
                res[idx++] = num;
                if (idx == k) break;
            }
        }
        return res;



    }
}
