package Arrays_and_Strings;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class IntToRoman {
    static Map<Integer,String> cMap = new HashMap<Integer,String>();

    static {
        cMap.put(1,   "I");
        cMap.put(5,  "V");
        cMap.put(10, "X");
        cMap.put(50, "L");
        cMap.put(100, "C");
        cMap.put(500, "D");
        cMap.put(1000, "M");

        cMap.put(4,  "IV");
        cMap.put(9,  "IX");
        cMap.put(40, "XL");
        cMap.put(90, "XC");
        cMap.put(400, "CD");
        cMap.put(900, "CM");
    }
    
    public static String intToRoman(int num) {
        if(cMap.containsKey(num)){
            return cMap.get(num);
        }
        int closeEnoughMin = cMap.keySet().stream().filter(x->x<num).max(Comparator.naturalOrder()).get();
        return cMap.get(closeEnoughMin) + intToRoman(num - closeEnoughMin) ;
    }

    public static void main(String[] args){
        int number = 500;
        System.out.println(intToRoman(number));

        number = 3;
        System.out.println(intToRoman(number));

        number = 4;
        System.out.println(intToRoman(number));

        number = 9;
        System.out.println(intToRoman(number));

        number = 58;
        System.out.println(intToRoman(number));

        number = 58;
        System.out.println(intToRoman(number));

    }
}


