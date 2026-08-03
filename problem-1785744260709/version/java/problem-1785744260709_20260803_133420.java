// Last updated: 8/3/2026, 1:34:20 PM
1class Solution {
2    public int numSpecialEquivGroups(String[] words) {
3        HashSet<String> record = new HashSet<>();
4        for(String str: words){
5            int[] even = new int[26];
6            int[] odd = new int[26];
7            for(int i=0;i < str.length();i++){
8                if(i % 2 == 0){
9                    even[str.charAt(i)- 'a']++;
10                }else{
11                    odd[str.charAt(i) - 'a']++;
12                }
13            }
14            record.add(Arrays.toString(even) + Arrays.toString(odd));
15        }
16         return record.size();
17    }
18}