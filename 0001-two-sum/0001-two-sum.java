class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int aim = target - nums[i];
            if (Map.containsKey(aim)) {
                return new int[]{Map.get(aim), i};
            }
            Map.put(nums[i], i);
        }
        return new int[]{};
    }
}