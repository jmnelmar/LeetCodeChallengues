def lengthOfLongestSubstring( s: str) -> int:   
    n = len(s)
    ans = 0
    # mp stores the current index of a character
    mp = {}
    i = 0
    # try to extend the range [i, j]
    for j in range(n):
        if s[j] in mp:
            i = max(mp[s[j]], i)
            ans = max(ans, j - i + 1)
            mp[s[j]] = j + 1

    return ans
        
    

s = "abcabcbb"
print(lengthOfLongestSubstring(s))
s = "bbbbb"
print(lengthOfLongestSubstring(s))
s = "pwwkew"
print(lengthOfLongestSubstring(s))
s = "dvdf"
print(lengthOfLongestSubstring(s))
s = "pwwkew"
print(lengthOfLongestSubstring(s))
s = "aab"
print(lengthOfLongestSubstring(s))