package Arrays_and_Strings;
class Solucion
{
    public static Integer lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }else if(s.equals(" ") || s.length() == 1){
            return 1;
        }

        String subString = "";
        int max = 0;

        for(int i = 0, j = i + 1; i < s.length(); i++ ){
            subString = s.charAt(i) + "";
            while(j < s.length()){
                if(!subString.contains( s.charAt(j) + "")){
                    subString += s.charAt(j) + "";
                }else{
                    break;
                }
                j++;
            }

            System.out.println(subString);
            if(subString.length() > max){ max = subString.length(); }
            subString = "";
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));

        s = "bbbbb";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));

        s = "wpwkew";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));

        s = "";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));

        s = " ";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));

        s = "c";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));
        
        s = "au";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));

        s = "aue";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));
        
        s = "aab";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));

        s = "dvdf";
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring(s));
    }

}