class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window=0;
        int maxsum=0;

        //create first window
        for(int i=0;i<k;i++){
            window+=nums[i];
        }

        //store  windowsum in maxsum
        maxsum=window;
        
        //create second window from k to num.length
        for(int i=k;i<nums.length;i++){
            window+=nums[i];
            //
            window-=nums[i-k];

             //update maxmium
             maxsum=Math.max(maxsum,window);
        }
        return (double) maxsum / k;
       
    }
    
}