// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
       int temp=n;
       int sum=0;
       while(n>0){
           int ld=n%10;
           sum=sum+(ld*ld*ld);
           n=n/10;
       }
       if(sum==temp) return true;
       else return false;
        
    }
    
}
