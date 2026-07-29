// Last updated: 7/29/2026, 1:39:59 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int min = nums[0];
4        int sum = 0;
5
6        for( int num : nums){
7            sum += num;
8            if(num < min){
9                min = num;
10            }
11        }
12        return sum -(min * nums.length);
13    }
14}