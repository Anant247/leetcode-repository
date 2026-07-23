class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] count = new int[128];

        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int low = 0;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        int needs = t.length();

        for(int high = 0; high<s.length(); high++){
            if (count[s.charAt(high)] > 0) {
               needs--;
            }
            count[s.charAt(high)]--;

            while(needs == 0){
                if(minlen > high - low + 1){
                    minlen = high - low + 1;
                    start = low;
                }
                count[s.charAt(low)]++;

                if (count[s.charAt(low)] > 0) {
                    needs++;
                }
                low++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen); 
    }
}