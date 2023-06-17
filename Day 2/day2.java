/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example:
Input: nums = [4,1,2,1,2]
Output: 4*/


public class day2{
public static int singleNumber(int nums[]){
    int ans=0;
    for(int num:nums){   //XORing each valur
        ans=ans^num;
    }
    return ans;
}
public static void main(String args[]){
    int nums[]={4,1,2,1,2};
    System.out.println(singleNumber(nums));
}
}