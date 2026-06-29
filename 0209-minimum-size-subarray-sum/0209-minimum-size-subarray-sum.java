class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int high = 0;
        int low = 0;
        int sum = 0;
        
        while (high < nums.length){
            sum += nums[high];
            while (sum >= target){
                result = Math.min(result, (high - low + 1));
                sum -= nums[low++];
            }
            high++;
        }
        return result != Integer.MAX_VALUE ? result : 0;        
    }
}