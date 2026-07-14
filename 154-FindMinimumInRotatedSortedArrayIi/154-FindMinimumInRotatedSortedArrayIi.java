// Last updated: 7/14/2026, 2:00:20 PM
class Solution {
    public int findMin(int[] nums) {
         int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } 
            else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            else {
                right--; 
            }
        }

        return nums[left];
    }
}