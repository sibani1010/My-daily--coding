/**Number of 1 Bits
Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.**/

public class Solution {
	public int numSetBits(long a) {
	    int count=0;
	    for(int i=0;i<32;i++)
	    {
	        if((a&(1<<i))!=0)//here we are doing AND operation between every bit of "a"  and 1.
			        //If the result is 1 then we have found a Set bit.
			        //To perform AND operation we are shifting of 1 to left for ith times.
	        {
	           count++; 
	        }
	    }
	   return count; 
	}
}
