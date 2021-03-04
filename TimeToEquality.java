/*Time to equality
Problem Description

Given an integer array A of size N. In one second you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.
  
  Example Input
A = [2, 4, 1, 3, 2]


Example Output
8


Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.*/


public class Solution {
    public int solve(int[] A) {
        
        Arrays.sort(A);
        int count=0;
        int n=A.length;
        int diff;
        for(int i=0;i<n-1;i++)
        {
            if(A[i]<A[n-1])
            {   
                diff=A[n-1]-A[i];
                count=count+diff;
            }
        }
        return count;
    }
}
