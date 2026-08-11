class Solution {
    public int maxArea(int[] height) {
        //two pointer start and last 
        int left=0;
        int right=height.length-1;
        int max_area=0;

        //cal Area and move shorter pointer inward
        while(left<right){
            int width = right - left;
            int heighta = Math.min(height[left], height[right]);
            int area=width*heighta;
            max_area=Math.max(max_area,area);

            if(height[left]>height[right]){
                //move shorter pointer
                right--;
            }
            else{
                left++;
            }
        }
        return max_area;
    }
}