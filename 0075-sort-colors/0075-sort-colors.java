public class Solution {
    public static void sortColors(int[] nums) {


        int left = 0;
        int mid = 0;
        int right = nums.length - 1;


        while(mid <= right) {

            if(nums[mid] == 0) {

                // swap left and mid
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;

                left++;
                mid++;
            }

            else if(nums[mid] == 1) {

                // 1 is already in correct place
                mid++;
            }

            else { // nums[mid] == 2

                // swap mid and right
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;

                right--;
            }
        }
    }
}
