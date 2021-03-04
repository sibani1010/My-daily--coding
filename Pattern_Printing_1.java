/**Pattern Printing -1
Problem Description

Print a Pattern According to The Given Value of A.

Example: For A = 3 pattern looks like:

1

1 2

1 2 3**/

public class Solution {
    public int[][] solve(int A) {
        int a[][]=new int[A][];
        
       int k=1;
        for(int i=0;i<A;i++)
        {   
            a[i]=new int[i+1];  
          
            for(int j=0;j<=i;j++)
            {   
                a[i][j]=k;
                k++;
            
            }
            k=1;
            
        }
        return a;
    }
}
