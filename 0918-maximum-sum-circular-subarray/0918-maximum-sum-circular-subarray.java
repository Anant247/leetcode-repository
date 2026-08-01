class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxbest = nums[0];
        int maxsum = nums[0];
        int minbest = nums[0];
        int minsum = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            maxbest = Math.max(nums[i], maxbest + nums[i]);
            maxsum = Math.max(maxsum, maxbest);

            minbest = Math.min(nums[i], minbest + nums[i]);
            minsum = Math.min(minsum, minbest);

        }
        if(maxsum < 0) return maxsum;

        return Math.max(maxsum, sum - minsum);
    }
}