/*Add Binary Strings
Given two binary strings, return their sum (also a binary string).

Example:

a = "100"

b = "11"
Return a + b = "111".*/
  
  
  public class Solution {
    public String addBinary(String A, String B) {
        StringBuilder str=new StringBuilder();
        int i=A.length()-1;
        int j=B.length()-1;
        int c=0;
        while((j>=0)||(i>=0))
        {
            int sum=c;
            if(i>=0)
            {
            sum+=(A.charAt(i)-'0');
            }
            if(j>=0)
            {
            sum+=(B.charAt(j)-'0');
            }
            
            str.append(sum%2);
            c=sum/2;
            i--;
            j--;
            
        }
        
        
        return str.reverse().toString();
    }
}
