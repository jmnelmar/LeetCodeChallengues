/**
 *Description: Given an array of integers, return indices of the two numbers 
 *such that they add up to a specific target. 
 *@nums: Array of int, represent the list of numbers
 *@numSize: int size of the Array nums, represent the size of the list
 *@target: int numbere to search in the list
 *@returnSize: int pointer to int that represent the size of the array returned.
 */

int *twoSum(int* nums, int numsSize, int target, int* returnSize){
    int *idxs=NULL, i, j;


    for( i=0; i < numsSize; i++){
        for(j=i+1; j < numsSize-1; j++){
            if(nums[i] + nums[j] == target){
                idxs= malloc(sizeof(int *) * 2);
                idxs[0] = i;
                idxs[1] = j;
                *returnSize = 2;
                break;
            }
        }
    }
    return idxs;
}
