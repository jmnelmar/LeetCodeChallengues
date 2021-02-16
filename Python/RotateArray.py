#Input: nums = [1,2,3,4,5,6,7], k = 3
#Output: [5,6,7,1,2,3,4]
#Explanation:
#rotate 1 steps to the right: [7,1,2,3,4,5,6]
#rotate 2 steps to the right: [6,7,1,2,3,4,5]
#rotate 3 steps to the right: [5,6,7,1,2,3,4]

nums = [1,2,3,4,5,6,7]
k = 10
#print(nums)

for i in range(0,k):
    toRotate = nums[len(nums)-1]
    nums = nums[:len(nums)-1]
    nums.insert(0,toRotate)
print(nums)
