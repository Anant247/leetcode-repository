class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int maxCount = 0;
        int ans = 0;
        int[] count = new int[26];
        
        for(int high = 0; high < s.length(); high++){
            maxCount = Math.max(maxCount,  
            ++count[s.charAt(high) - 'A']);
 
            while (high - low +1 - maxCount > k){
                count[s.charAt(low) - 'A']--;
                low++;
            }
            ans = Math.max(ans, high - low +1);
        }
        return ans;
    }
}