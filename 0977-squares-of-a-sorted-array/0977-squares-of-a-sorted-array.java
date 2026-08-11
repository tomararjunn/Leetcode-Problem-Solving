class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        int k=j;
        int[] ans = new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[k]=nums[i]*nums[i];
                i++;
            } else{
            ans[k]=nums[j]*nums[j];
            j--;
            }
            k--;
        }
        return ans;
    }
}
    