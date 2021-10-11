package Arrays_and_Strings;
/*
Given an integer array nums of length n and an integer target, find three integers in nums such that 
the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.

Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
 
*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
1. sort the array.
2. iterate from the negatives sides.
3. iterate both side left and rigth
3. check if the diference between target and triplet sum is lesser than the actual clossest.
*/
public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        //1. sort the array
        Arrays.sort(nums);
        //Asigning the maximun value of an integer to the distance
        int distance = Integer.MAX_VALUE;
        //assigning the length of the array to avoid calculate in each iteration
        int len = nums.length - 1;
        //2. Iterate the array stops if the distance is zero(there are no closser distance than zero).
        for(int i = 0; i < nums.length && distance != 0; i++ ){
            //Assigning pointer to iterate the array from both sides left and right lefting i anchored 
            //as starting point no need to iterate someting lesser than i since is alreade iterated
            int ptrLeft = i + 1, ptrRight = len;
            //Iterating from both side tile pointers meet in the midle 
            while(ptrLeft < ptrRight){
                int sum = nums[i] + nums[ptrLeft] + nums[ptrRight];
                //calculating the distance as the sum of the target plus the result of the sum by -1
                //if that is equals to the actual distance that means new distance is closser than 
                //the actual
                if(Math.abs(target + (sum*-1)) < Math.abs(distance)){
                    distance = target - sum;
                }
                //checking if the sume is lesser than the target that mean I need to move to the higger
                //values, as the array is sorted higger values are to the right.
                //for sum values higger or equal than target move to the left;
                if(sum < target)
                    ptrLeft++;
                else
                    ptrRight--;
            }
        }
        //returning the diference of target minus discace which give us the sum between them.
        return target - distance;
    }
    

    public static void main(String[] args){

        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));

        nums = new int[]{0,0,0};
        target = 0;
        System.out.println(threeSumClosest(nums, target));

        nums = new int[]{0,1,2};
        target = 0;
        System.out.println(threeSumClosest(nums, target));

        nums = new int[]{1,1,1,0};
        target = -100;
        System.out.println(threeSumClosest(nums, target));

        nums = new int[]{0,2,1,-3};
        target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}


