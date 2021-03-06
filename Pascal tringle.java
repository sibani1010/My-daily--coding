/*Pascal Triangle
Given numRows, generate the first numRows of Pascal's triangle.
  Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
*/
public class Solution {
    public int[][] solve(int A) {
        int i,j;
        int a[][]=new int[A][];
        for(i=0;i<A;i++)
        {    a[i]=new int[i+1];
            for(j=0;j<=i;j++)
            {
                if(j==i||j==0)
                {
                a[i][j]=1;
                }
                else
                {
                a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        return a;
    }
}
