#Input: nums = [1,2,3,4,5,6,7], k = 3
#Output: [5,6,7,1,2,3,4]
#Explanation:
#rotate 1 steps to the right: [7,1,2,3,4,5,6]
#rotate 2 steps to the right: [6,7,1,2,3,4,5]
#rotate 3 steps to the right: [5,6,7,1,2,3,4]

nums = [1,2,3,4,5,6,7]
k = 3
n = len(nums)
a = [0] * n

for i in range(n):
    a[i] = nums[i-n+1+k]
nums[:] = a
print(nums)
