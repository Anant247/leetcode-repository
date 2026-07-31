class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxbest = nums[0];
        int minbest = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxbest = Math.max(maxbest + nums[i], nums[i]);
            minbest = Math.min(minbest + nums[i], nums[i]);
            res = Math.max(res, Math.max(maxbest, Math.abs(minbest)));
        }

        return res;
    }
}