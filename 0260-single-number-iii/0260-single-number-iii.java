class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int Right=xor&-xor;
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&Right)!=0){
                x^=nums[i];
            }
            else{
                y^=nums[i];
            }
        }
        return new int[]{x, y};
    }
}