class Solution {
    public int findDuplicate(int[] nums) {
        //intizialize
        int slow=nums[0];
        int fast=nums[nums[0]];

        //Find the meeting point(slow=fast)

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }

        //Find Duplicate value
        int slow2=0;

        while(slow!=slow2){
            slow=nums[slow];
            slow2=nums[slow2];
        }
        return slow;
    }
}