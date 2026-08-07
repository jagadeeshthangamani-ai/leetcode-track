// Last updated: 8/7/2026, 12:09:37 PM
1class Solution {
2    public boolean isValidSerialization(String preorder) {
3        String[] nodes = preorder.split(",");
4        int slots = 1;
5        for (String node : nodes) {
6            if (slots == 0) return false;
7            slots--;
8            if (!node.equals("#")) {
9                slots += 2;
10            }
11        }
12        return slots == 0;
13    }
14}