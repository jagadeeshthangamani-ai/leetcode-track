// Last updated: 7/15/2026, 12:38:39 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        for (int i = 0; i < nums.length - 1; i += 2) {
4    if (nums[i] != nums[i + 1]) {
5        return nums[i];
6    }
7  }
8    return nums[nums.length - 1];     
9 }
10}