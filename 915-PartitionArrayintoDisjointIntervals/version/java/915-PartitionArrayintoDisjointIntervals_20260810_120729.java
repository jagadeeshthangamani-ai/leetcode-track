// Last updated: 8/10/2026, 12:07:29 PM
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int n = nums.length;
4        int [] v =  new int[n];
5        int mx = Integer.MAX_VALUE;
6        for(int i=n-1;i>=0;i--){
7            mx = Math.min(mx,nums[i]);
8            v[i]=mx;
9        }
10        mx = Integer.MIN_VALUE;
11        int pos = -1;
12        for(int i=0;i<n-1;i++){
13            mx = Math.max(mx,nums[i]);
14            if(mx<=v[i+1]){
15                pos = i;
16                break;
17            }
18        }
19        return pos+1;
20
21    }
22}