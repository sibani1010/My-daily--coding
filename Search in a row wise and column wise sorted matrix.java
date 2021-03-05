/*Search in a row wise and column wise sorted matrix
Problem Description



Example Input
A = [ [1, 2, 3]
          [4, 5, 6]
          [7, 8, 9] ]
B = 2


Example Output
1011


Example Explanation
A[1][2]= 2
1*1009 + 2 =1011


Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in increasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.



Example Input
A = [ [1, 2, 3]
          [4, 5, 6]
          [7, 8, 9] ]
B = 2


Example Output
1011


Example Explanation
A[1][2]= 2
1*1009 + 2 =1011*/


public class Solution {
    public int solve(int[][] A, int B) {
        
        int M=A.length;
        int N=A[0].length;
        int ans;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(A[i][j]==B)
                {   
                    ans=((i+1)*1009)+(j+1);
                    return ans;
                }
            }
            
        }
        return -1;
        
    }
}


