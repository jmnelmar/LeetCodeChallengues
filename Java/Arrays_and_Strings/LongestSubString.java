package Arrays_and_Strings;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }else if(s.equals(" ") || s.length() == 1){
            return 1;
        }

        String subString = "";
        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++ ){
            subString = s.charAt(i) + "";
            for(int j = i + 1; j < s.length(); j++){
            
                if(!subString.contains( s.charAt(j) + "")){
                    subString += s.charAt(j) + "";
                }else{
                    //map.put(i, subString);
                    //i = j;
                    break;
                }
            }
            map.put(i, subString);
            subString = "";
        }

        int max = 0;
        int aux = 0;
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            
            aux = entry.getValue().length();
            //System.out.println("value: "+entry.getValue()+", length: "+aux);
            if( aux > max){
                max = aux;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String value = "abcabcbb";
        System.out.println("Value to check: "+value);
        int result = lengthOfLongestSubstring(value);
        System.out.println("result: "+result);
        System.out.println("length: "+result);
        
        System.out.println("");
        value = "bbbbb";
        System.out.println("Value to check: "+value);
        result = lengthOfLongestSubstring(value);
        System.out.println("result: "+result);
        System.out.println("length: "+result);

        System.out.println("");
        value = "pwwkew";
        System.out.println("Value to check: "+value);
        result = lengthOfLongestSubstring(value);
        System.out.println("result: "+result);
        System.out.println("length: "+result);

        String s ="c";
        
        if(s.equals(""))
            System.out.println(0);
        else if(s.equals(" "))
            System.out.println(1);
        System.out.println(s.length());
    }
    

}
