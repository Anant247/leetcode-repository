class Solution {
    public int largestAltitude(int[] gain) {
        int max_altitude = 0;
        int total_altitude = 0;
        for(int i = 0; i < gain.length; i++){
            total_altitude += gain[i];
            max_altitude = Math.max(max_altitude, total_altitude); 
        }
        return max_altitude;
    }
}