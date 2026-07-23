// Last updated: 7/23/2026, 12:24:59 PM
1class Solution {
2    public String customSortString(String order, String s) {
3        int [] map = new int [26];
4        for(int i = 0; i < s.length();i++){
5            map[s.charAt(i) - 'a'] ++;
6        }
7            StringBuilder result = new StringBuilder();
8
9            for(int i=0;i<order.length();i++){
10                for(int j=0;j<map[order.charAt(i) - 'a'];j++){
11                    result.append(order.charAt(i));
12                }
13                map[order.charAt(i) - 'a'] = 0;
14            }
15
16            for(int i=0;i<26;i++){
17                for(int j = 0;j<map[i];j++){
18                    result.append((char)('a' + i));
19                }
20            }
21            return result.toString();
22        }
23    }
24