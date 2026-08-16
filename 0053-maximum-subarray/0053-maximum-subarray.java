//kandane algo
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //sum fun
            sum=sum+nums[i];
            //max compare
            maxsum=Math.max(maxsum,sum);
            //negative sum=0;
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}