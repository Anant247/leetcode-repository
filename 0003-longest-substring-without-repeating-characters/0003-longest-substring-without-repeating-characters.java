class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(); 
        int low = 0;
        int maxlen = 0; 
        HashSet<Character> set = new HashSet<>();

        for(int high = 0; high<n; high++){
        
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(s.charAt(high));
            maxlen = Math.max(maxlen, high - low + 1);
        }
        return maxlen; 
    }
}