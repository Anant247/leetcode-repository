class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int maxdiff = Integer.MAX_VALUE;
        int ressum = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 2 ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                int diff =  Math.abs(sum - target);   
                if(sum == target){
                    return sum;
                }
                if(maxdiff > diff){
                    maxdiff = diff;
                    ressum = sum;
                }
                if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ressum;
    }
}