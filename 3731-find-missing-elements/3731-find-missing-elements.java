class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x : nums){
            set.add(x);
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        for(int i = min + 1; i < max; i++){
            if(!set.contains(i)) {
                list.add(i); 
            }
        }
        return list; 
    }
}