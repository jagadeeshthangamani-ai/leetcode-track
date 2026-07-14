// Last updated: 7/14/2026, 1:59:31 PM
class Solution {
    public int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
       int result = 0;

       for(int i =0 ;i < nums.length;i += 2){
        result += nums[i];
       }
       return result;
    }
}