class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int bucket = capacity;
        int steps = 0;

        for(int i = 0; i < plants.length; i++){
            if(plants[i] > bucket){
                steps += 2*i;
                bucket = capacity;
            }
            
            bucket -= plants[i];
            steps++;

        }
        return steps; 
    }
}