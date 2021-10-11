package Arrays_and_Strings;
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
import java.util.*;
public class IntToRoman2 {
    /*Static map which has roman initial set of numbers*/
    static Map<Integer, String> romansMap = new HashMap<Integer, String>();

    /*Static Block which only runs one when the class is loaded in memory*/
    static{
        romansMap.put(1,"I");
        romansMap.put(5,"V");
        romansMap.put(10,"X");
        romansMap.put(50,"L");
        romansMap.put(100,"C");
        romansMap.put(500,"D");
        romansMap.put(1000,"M");

        romansMap.put(4,  "IV");
        romansMap.put(9,  "IX");
        romansMap.put(40, "XL");
        romansMap.put(90, "XC");
        romansMap.put(400, "CD");
        romansMap.put(900, "CM");
    }

    public static String intToRoman(int num){
        String romanNumber= "";
        if(romansMap.containsKey(num)){
            return  romansMap.get(num);
        }

        
        int closser = romansMap.keySet().stream().filter(predicate-> predicate < num).max(Comparator.naturalOrder()).get();
        romanNumber = romansMap.get(closser) + intToRoman(num - closser);
        System.out.println(closser);

        return romanNumber;

    }

    public static String intToRoman2(int number){
        if(romansMap.containsKey(number)){
            return romansMap.get(number);
        }

        int closser = romansMap.keySet().stream().filter(predicate-> predicate < number).max(Comparator.naturalOrder()).get();
        return romansMap.get(closser) + intToRoman2( number - closser);
    }

    

    public static void main(String[] args){
        int num = 558;
        System.out.println(intToRoman(num));
    }
    
}
