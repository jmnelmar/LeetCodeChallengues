package Arrays_and_Strings;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

for(int i=0; i < nums.length - 3; i++){
    for(int j = i + 1; j < nums.length - 2; j+=2){
        if(nums[i]+nums[j]+nums[j+1]){

        }
    }
}

Example 2:
Input: nums = []
Output: []
Example 3:
Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
*/
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
public class ThreeSum{
    
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultListOfList = new ArrayList<List<Integer>>();
        if(nums == null)
            return resultListOfList;
        
        if((nums.length ==1 && nums[0] == 0))
            return resultListOfList;
   
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length /*- 1*/; j++){
                for(int k = 0; k < nums.length; k++){
                    if(i!=j && j != k && k != i){
                        List<Integer> list = new ArrayList<Integer>();
                        if(nums[i]+nums[j]+nums[k] == 0){
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            Collections.sort(list);
                            if(!resultListOfList.contains(list) && list.size() > 0){
                                resultListOfList.add(list);
                            }
                        }                 
                    }
                }
            }
        }

        return resultListOfList;
    }

    public static void printListOfLists(List<List<Integer>> listOfList){
        System.out.print("[");
        listOfList.forEach( x -> {
            System.out.print(x+",");
        }    
        );
        System.out.print("]"); 
    }

    public static void main(String[] args){
        int[] numbers = {-1,0,1,2,-1,-4};
        printListOfLists(threeSum(numbers));
        System.out.println("");

        numbers = new int[]{0};
        printListOfLists(threeSum(numbers));
        System.out.println("");

        numbers = null;
        printListOfLists(threeSum(numbers));
        System.out.println("");

        numbers = new int[]{0,0,0};
        printListOfLists(threeSum(numbers));
        System.out.println("");

        numbers = new int[]{1,-1,-1,0};
        printListOfLists(threeSum(numbers));
        System.out.println("");

        numbers = new int[]{-2,0,1,1,2};
        printListOfLists(threeSum(numbers));
        System.out.println("");

        numbers = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
        printListOfLists(threeSum(numbers));
        System.out.println("");

    }
}
//[-1,0,1,2,-1,-4,-2,-3,3,0,4]
//[[-4,1,3],[-3,-1,4],[-2,-1,3],[-2,0,2]]
//[[-1, 0, 1],[-1, -1, 2],[-3, 0, 3],[-4, 0, 4],[-3, 1, 2],]

//[,,,,,,,,,,]
//[-4,-3,-2,-1,-1,0,0,1,2,3,4]