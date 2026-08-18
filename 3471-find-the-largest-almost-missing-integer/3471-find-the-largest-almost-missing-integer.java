class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] map = new int[51];
        int res = -1;

        for (int num : nums) {
            map[num]++;
        }

        if (k == n) {
            int max = 0;

            for (int num : nums) {
                max = Math.max(max, num);
            }

            return max;
        }

        if (k == 1) {
            for (int i = 50; i >= 0; i--) {
                if (map[i] == 1) {
                    return i;
                }
            }
            return -1;
        }

        if (map[nums[0]] == 1) {
            res = Math.max(res, nums[0]);
        }

        if (map[nums[n - 1]] == 1) {
            res = Math.max(res, nums[n - 1]);
        }

        return res;
    }
}