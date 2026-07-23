class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> target = new HashMap<>();
        for(char c : t.toCharArray()){
            target.put(c, target.getOrDefault(c,0) + 1);
        }
        
        HashMap<Character, Integer> current = new HashMap<>();
        
        int low = 0;
        int start = 0;
        int res = Integer.MAX_VALUE;
        
        for (int high = 0; high < s.length(); high++){
            current.put(s.charAt(high), current.getOrDefault(s.charAt(high), 0) +1);
            while (charcontain (current, target)){
                if(res > high - low +1){
                    res = high - low +1;
                    start = low;
                }
                current.put(s.charAt(low), current.get(s.charAt(low)) -1);
                if(current.get(s.charAt(low)) == 0){
                    current.remove(s.charAt(low));
                }
                low++;
            }
        }
        if (res == Integer.MAX_VALUE)return "";
        return s.substring(start, start + res);
    }
    public boolean charcontain (HashMap<Character,Integer> current, HashMap<Character, Integer> target){
        for(Character c : target.keySet()){
            
            if(!current.containsKey(c)) return false;
            if(current.get(c) < target.get(c)) return false;
        }
        return true;
    }
}