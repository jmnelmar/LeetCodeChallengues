'''
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
'''
def plusOne(digits):
        n = len(digits) -1
        carry = 0

        while(n >= 0):
            
            if n == len(digits) - 1:
                digits[n] += 1
            if carry > 0:
                digits[n] += carry
                carry = 0

            if digits[n] > 9:
                carry = 1
                digits[n] -=  10

            #print(f'{digits}, carry: {carry}, n: {n}')
           
            n -= 1
        
        if carry > 0:
            digits.insert(0,1)

        print(digits)

        '''
        for i in range(n):
            print(digits[-i])
            if carry > 0:
                digits[-i] += carry
            digits[-i] += 1
            if digits[-i] > 9:
                carry = 1
                digits[-i] -=  10
        '''
       
#[ 9, 9, 0] carry = 1 
digits = [9,9,9]
plusOne(digits)
digits = [8,9,9,9]
plusOne(digits)