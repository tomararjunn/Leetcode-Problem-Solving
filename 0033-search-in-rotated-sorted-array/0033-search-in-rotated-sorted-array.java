class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int n=nums.length;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
            //target is mid
            if (nums[mid] == target) {
                return mid;
            }
            //target lies in left subtree
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            //target lies in Right subtree
            else{
                if(nums[mid]<target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
