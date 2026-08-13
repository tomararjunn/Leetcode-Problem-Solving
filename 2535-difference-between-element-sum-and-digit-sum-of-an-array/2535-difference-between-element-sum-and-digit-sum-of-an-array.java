class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digits=0;
        for(int add:nums){
            sum+=add;
            while(add>0){
                digits+=add%10;
                add=add/10;
            }
        }
        int ans=sum-digits;
        return ans;
    }
}