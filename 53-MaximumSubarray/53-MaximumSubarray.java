// Last updated: 7/14/2026, 2:00:55 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;

        for(int n : nums){
            if(total < 0){
                total = 0;
            }
         total += n;
         res = Math.max(res, total);   
        }

        return res;
    }
}