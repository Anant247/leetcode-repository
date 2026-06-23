class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_area = 0;
        int h = 0;
        
        while (i<j){
            int w = j - i;
            if(height[i] < height[j]){
                h = height[i];
                i++;
            }else{
                h = height[j];
                j--;
            }
            int area = w*h;
            if(area > max_area){
                max_area = area;
            }
        }
        return max_area;
    }
}