/*Smaller and Greater
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.**/
public class Solution {
    public int solve(int[] A) {
        int count=0;
        
        Arrays.sort(A);
        int small=A[0];
        int n=A.length;
        int big=A[n-1];
        for (int i=0;i<n;i++)
        {
            if(small<A[i] && A[i]<big)
            
            count++;
        }
        return count;
        }
        
    }
