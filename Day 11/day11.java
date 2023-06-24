/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example :
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example :
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/

public class day11{
    public static int[] proExeSelf(int nums[]){
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=1;
        }

        int left=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=ans[i]*left;
            left=left*ans[i];
        }

        int right=1;
        for(int i=nums.length;i>=0;i--){
            ans[i]=ans[i]*right;
            right=right*ans[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        int result[]=proExeSelf(nums);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}