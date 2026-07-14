// Last updated: 7/14/2026, 2:00:45 PM
class Solution {
   
  static int climbStairs(int n) {
        if(n<=2)
        return n;
        int n1=1;
        int n2=2;
        int cu=0;
        for(int i=3;i<=n;i++){
            cu=n1+n2;
            n1=n2;
            n2=cu;
        }
        return cu;
    }
    public static void main(String []args){
        int n=3;
        int r = climbStairs(n);
        System.out.println(r);
    }
}