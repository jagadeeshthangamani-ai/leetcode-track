// Last updated: 7/14/2026, 1:59:38 PM
class Solution {
    public boolean scoreBalance(String s) {
        int n=s.length();
        int sum=0;
        for(char c:s.toCharArray()){
            sum+=(c-'a'+1);
        }
        int ls=0;
        int rs=sum;
        for(int i=0;i<n-1;i++){
            int value=s.charAt(i)-'a'+1;

            ls+=value;
            rs-=value;

        
        if(ls==rs) {
            return true;
        }
     }
      return false;
    }
}