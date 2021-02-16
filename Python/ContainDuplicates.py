#Brute Force
def containsDuplicate(nums):
    for i in range(len(nums)):
        match = 0
        for j in range(len(nums)):
            if nums[i] == nums[j]:
                match+=1
                if match > 1:
                    return True
    return False

#Sorting the Array
def containsDuplicate2(nums):
    nums.sort()
    for i in range(len(nums) - 1):
        if nums[i] == nums[i + 1]:
            return True
    return False

nums = [1,2,3,1]
print( containsDuplicate2(nums) )
nums[:] = [1,2,3,4]
print( containsDuplicate2(nums) )
nums[:] = [1,1,1,3,3,4,3,2,4,2]
print( containsDuplicate2(nums) )
