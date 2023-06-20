/*You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step*/

public class day5{
    public static int climbStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a[]=new int[4];
        a[0]=1;
        a[1]=2;
        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(climbStairs(n));
    }
}