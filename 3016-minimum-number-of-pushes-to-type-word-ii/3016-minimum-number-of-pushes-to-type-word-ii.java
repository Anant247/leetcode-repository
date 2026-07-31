class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        int n = word.length();

        for(char c : word.toCharArray()){
            count[c - 'a']++;
        }
        Arrays.sort(count);
        int[] newcount = new int[26];
        for(int i = 0; i < 26; i++){
            newcount[i] = count[25 - i];
        }

        int push = 0;
        for(int i = 0; i < 26; i++){
            if(newcount[i] == 0) break;
            push += (i/8 + 1) * newcount[i]; 
        }
        return push;
    }
}