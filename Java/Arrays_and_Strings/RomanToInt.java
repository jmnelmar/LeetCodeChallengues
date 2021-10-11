package Arrays_and_Strings;
import java.util.*;
public class RomanToInt {
    static Map<String, Integer> romanMap = new HashMap();
    static{
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        romanMap.put("IV",4);
        romanMap.put("IX",9);
        romanMap.put("XL",40);
        romanMap.put("XC",90);
        romanMap.put("CD",400);
        romanMap.put("CM",900);

    }

    public static int romanToInt(String roman){
        int count = 0;
        int result = 0;
        String parse = "";
        while(count < roman.length()){
            if(count < roman.length()-1){
                if(romanMap.containsKey((roman.charAt(count)+"") + (roman.charAt(count + 1)+""))){
                    parse = (roman.charAt(count)+"") + (roman.charAt(count+1)+"");
                    count++;    
                    
                }else{
                    parse = roman.charAt(count)+"";
                }
            }else{
                parse = roman.charAt(count)+"";
            }

            
            result += romanMap.get(parse);
            count++;
            parse = "";
        }
        return result;
    }

    public static void main(String[] args){
        String num = "III";
        System.out.println("roman: "+num+" number:"+romanToInt(num));
        num = "IV";
        System.out.println("roman: "+num+" number:"+romanToInt(num));
        num = "IX";
        System.out.println("roman: "+num+" number:"+romanToInt(num));
        num = "LVIII";
        System.out.println("roman: "+num+" number:"+romanToInt(num));
        num = "MCMXCIV";
        System.out.println("roman: "+num+" number:"+romanToInt(num));
    }
}
