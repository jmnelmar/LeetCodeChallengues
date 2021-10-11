package Arrays_and_Strings;
/*Implement strStr().
Return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.
Clarification:
What should we return when needle is an empty string? 
This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This 
is consistent to C's strstr() and Java's indexOf().*/

public class MystrStr{
    public static int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();

        if(needle.isEmpty())
            return 0;

        for(int i = 0; i< haystackLen && needleLen + i <= haystackLen; i++){
            String sbstr = "";
            sbstr = haystack.substring(i, needleLen + i);
            if(sbstr.equals(needle)){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
        
        haystack = "aaaaa";
        needle = "bba";
        System.out.println(strStr(haystack, needle));

        haystack = "";
        needle = "";
        System.out.println(strStr(haystack, needle));
        
        haystack = "simona";
        needle = "na";
        System.out.println(strStr(haystack, needle));

        haystack = "Usados confiables";
        needle = " con";
        System.out.println(strStr(haystack, needle));

    }
}