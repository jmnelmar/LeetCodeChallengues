package Arrays_and_Strings;
public class MyAtoi {

    public static int myAtoi(String s) {
        int result = 0;
        int i =0;
        int multiplier = 1;
        if(s.isEmpty() || s.isBlank())
            return 0;
        //if there are leading zeros moving forward the iterator
        while(s.charAt(i) == ' '){
            i++;
            //System.out.println("Space: "+i);
        }

        //checking the sign and removing it from the string
        char firstChar = s.charAt(i);
        if(firstChar == '-' || firstChar == '+'){
            //s = s.substring(1, s.length());
            i++;
            if(firstChar == '-')
                multiplier = -1;
        }
        


        //for( ; i < s.length(); i++){
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            //checking if the result is bigger than the max or less than the allowed
            
            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)){
                
                if(firstChar == '-'){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }

            //checking if is a digit
            if (Character.isDigit(s.charAt(i)) == false && result == 0)
            {
                return 0;
            }else if(Character.isDigit(s.charAt(i)) == false && result != 0){
                return result * multiplier;
            }

            //converting the character to a digit base 10
            result = result * 10 + s.charAt(i) - '0';
            i++; 
        }
        
        //multiplying by the sign in case were negative
        return result *  multiplier;
    }

    public static void main(String[] args){
        String number = "42";
        System.out.println(myAtoi(number));

        number = "-42";
        System.out.println(myAtoi(number));

        number = "9147483647";
        System.out.println(myAtoi(number));

        number = "-9147483647";
        System.out.println(myAtoi(number));

        number = "a123";
        System.out.println(myAtoi(number));

        number = "-a123";
        System.out.println(myAtoi(number));

        number = "-1a23";
        System.out.println(myAtoi(number));
        
        number = "1a23";
        System.out.println(myAtoi(number));

        number = "1342a";
        System.out.println(myAtoi(number));

        number = "   -42";
        System.out.println(myAtoi(number));

        number = "4193 with words";
        System.out.println(myAtoi(number));

        number = "";
        System.out.println(myAtoi(number));
        
        number = "      ";
        //System.out.println(number.isBlank());
        System.out.println(myAtoi(number));

        number ="  -0012a42";
        System.out.println(myAtoi(number));

        number = " -1010023630o4";
        System.out.println(myAtoi(number));

        number = "-91283472332";
        System.out.println(myAtoi(number));
    }

    /*1010023630
    2147483648

    1010023630
    214748364
    -2147483648*/
}
