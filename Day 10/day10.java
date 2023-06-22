/*Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer. 
Example:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/

import java.lang.module.ResolutionException;

public class day10{
    public static int maxProduct(int nums[]){
        int currProduct=1;
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currProduct=currProduct*nums[i];
            ans=Math.max(currProduct,ans);
            if(currProduct == 0){
                currProduct=1;
            }
        }

        currProduct=1;
        for(int i=nums.length-1;i>=0;i--){
            currProduct=currProduct*nums[i];
            ans=Math.max(currProduct,ans);
            if(currProduct == 0){
                currProduct=1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[]={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}