/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.
Example:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/

import java.util.*;
public class day3{
    public static int[] twoSum(int nums[],int target){
        int first=0,last=nums.length-1;
        int ans[]=new int[2];
        while(first < last){
            int sum=nums[first]+nums[last];
            if(sum < target){
                first++;
            }
            else if(sum > target){
                last--;
            }
            else{
                ans[0]=first+1;
                ans[1]=last+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int num[]={2,7,11,15};
        System.out.println(twoSum(num,9));
    }
}
