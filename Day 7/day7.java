/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1*/

public class day7{
    public static int searchInsert(int num[],int target){
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                return i;
            }
            else if(num[i]<target){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int num[]={1,3,5,6};
        System.out.print(searchInsert(num, 7));
    }
}