class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int n=nums.length;
        int high=n-1;
        int found=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                found=mid;
                break;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            
        } return found;
    }
}