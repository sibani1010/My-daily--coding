/*Little Ponny and Maximum Element
Problem Description

Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.

He wants your help for finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible then return -1.
  Example Input
Input 1:

 A = [2, 4, 3, 1, 5]
 B = 3 
Input 2:

 A = [1, 4, 2]
 B = 3 


Example Output
Output 1:

 2 
Output 2:

 -1 
   
Example Explanation
Explanation 1:

 We need to remove 4 and 5 to make 3 the biggest element. 
Explanation 2:

 As 3 doesn't exist in the array, the answer is -1. */
   
   
  public class Solution {
    public int solve(int[] A, int B) {
        int count=0;
         Arrays.sort(A); 
         int res = Arrays.binarySearch(A, B); 
        
       if(res>0)
       {
           for(int i=0;i<A.length;i++)
           {
               if(A[i]>B)
               count++;
           }
            return count;
       }
       else
       return -1;
    }
}
