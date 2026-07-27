class Solution {
    public int maxProduct(int[] nums) {

        int ans = nums[0];
        int maxbest = nums[0];
        int minbest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < 0) {
                int temp = maxbest;
                maxbest = minbest;
                minbest = temp;
            }

            maxbest = Math.max(nums[i], maxbest * nums[i]);
            minbest = Math.min(nums[i], minbest * nums[i]);
            ans = Math.max(ans, maxbest);
        }
        return ans;
    }
}