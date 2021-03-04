/**Single Number
Problem Description

Given an array of integers A, every element appears twice except for one. Find that single one.
Example Input
Input 1:

 A = [1, 2, 2, 3, 1]
Input 2:

 A = [1, 2, 2]


Example Output
Output 1:

 3
Output 2:

 1**/

public class Solution {
    
    public int singleNumber(final int[] A) {
        int a=0;
        for(int i=0;i<A.length;i++)
        {
            a=a^A[i];
        }
        return a;
        
    }
}
