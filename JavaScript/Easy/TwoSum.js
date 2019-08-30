/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var i,j;
    var idx = [];
    for(i=0; i < nums.length-1; i++){
        for( j = i+1; j<nums.length; j++)
        if(nums[i]+nums[j]===target){
            idx[0]=i;
            idx[1]=j;
            break;
        }
    }
    return idx;
};
