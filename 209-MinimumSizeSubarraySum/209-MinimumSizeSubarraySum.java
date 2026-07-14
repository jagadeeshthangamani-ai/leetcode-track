// Last updated: 7/14/2026, 2:00:13 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0 ;
        int cursum = 0;
        for(int right = 0;right < nums.length;right++){
            cursum +=nums[right];

            while(cursum >= target){
                if(right - left + 1 < min){
                    min = right - left+1;
                }
                cursum -= nums[left];
                left++;
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}