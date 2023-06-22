/*Given an integer array nums, find the subarray with the largest sum, and return its sum. 
Example:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.*/

public class day9{
    public static int maxSubArray(int num[]){
        int maxSofar=num[0];
        int currSum=num[0];
        for(int i=1;i<num.length;i++){
            if(currSum < 0){
                currSum=0;
            }
            currSum=currSum+num[i];
            if(currSum > maxSofar){
                maxSofar=currSum;
            }
        }
        return maxSofar;
    }
    public static void main(String args[]){
        int num[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSubArray(num));
    }
}