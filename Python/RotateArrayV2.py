nums = [1,2,3,4,5,6,7]
k = 3


n = len(nums)
a = [0] * n

for i in range(n):
    if i < k :
        a[(k-i)-1] = nums[n-i-1]
    else:
        print(i-k)
        a[i] = nums[i-k]
nums[:] = a
print(nums)

#Output: [5,6,7,1,2,3,4]