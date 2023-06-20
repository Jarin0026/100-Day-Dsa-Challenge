/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Example:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101*/

import java.util.*;
public class day6{
    public static int[] countBits(int n){
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=Integer.bitCount(i);
        }
        return ans;
        }
        public static void main(String args[]){
            int n=4;
            System.out.print(countBits(n)+" ");
            int m=8;
            System.out.print(Integer.bitCount(m));
        }
}

