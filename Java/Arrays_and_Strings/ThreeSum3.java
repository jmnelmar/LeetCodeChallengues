package Arrays_and_Strings;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum3 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
        //1. Sort the array to avoid duplicated triplets.
        Arrays.sort(nums);
        //2. Iterate thru negative values.
        for(int i = 0; i < nums.length && nums[i] <= 0; i++ )
            //Skiping duplicates
            if(i == 0 || nums[i - 1] != nums[i])
                //3. Iterate thru both side from the actual index +1 to the midle and from the last index to the midle.
                //4. sum and compare.
                //5. add the values to the collection.
                //6. Skip duplicates.
                iterateBothSides(nums, i, listOfList);
        return listOfList;
    }

    public static void iterateBothSides(int[] nums, int i, List<List<Integer>> lol){
        int ptrLeft = i + 1, ptrRight = nums.length - 1;
        //iterating from both sides
        while( ptrLeft < ptrRight ){
            int sum = nums[i] + nums[ptrLeft] + nums[ptrRight];
                   
            if(sum < 0)//if sum > 0 means right side has greaters values than left side, moving the pointer to the lesser numbers
                ptrLeft++;
            else if(sum > 0)//if sum < 0 means left side has higer negative values than the right side, moving lesser negative values
                ptrRight--;
            else{//case when sum is equal to zero adding the values to the collection
                //Adding values to the collection
                //making sure to not iterate till infinity in case that rigth were the last index moving to the left
                //moving to the right to save one iteration at the same time to store the values to the collection.
                lol.add(Arrays.asList(nums[i],nums[ptrLeft++], nums[ptrRight--]));
                
                //Iterating thru all the duplicates values
                while( ptrLeft < ptrRight  && nums[ptrLeft] == nums[ptrLeft - 1])
                    ptrLeft++;
                
            }
        }
    
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

        numbers = new int[]{1,3,-1,2,-1,4};
        printListOfLists(threeSum(numbers));
        System.out.println("");
        numbers = new int[]{-2,0,1,1,2};
        printListOfLists(threeSum(numbers));
        System.out.println("");

        numbers = new int[]{-2,0,0,2,2};
        printListOfLists(threeSum(numbers));
        System.out.println("");
    }
    
    
}
