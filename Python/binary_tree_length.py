#Given an array as representation of a binary tree
#Calculate 

def len(tree):
    if not tree:
        return 0    
    
    left = 1
    right = 1

    for i in range(1,len(tree)):
        if tree[0] >= 0:
            if i % 2 == 0:
                right += 1
            else:
                left += 1
    if left > right:
        return left
    elif right > left:
        return right
    elif right == left:
        return left
