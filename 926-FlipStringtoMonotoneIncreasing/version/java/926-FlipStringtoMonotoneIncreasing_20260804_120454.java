// Last updated: 8/4/2026, 12:04:54 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3         int ones = 0;
4        int flips = 0;
5
6        for (char c : s.toCharArray()) {
7            if (c == '1') {
8                ones++;
9            } else {
10                flips = Math.min(flips + 1, ones);
11            }
12        }
13        return flips;
14    }
15}