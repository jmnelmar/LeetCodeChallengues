package Arrays_and_Strings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class NumberOfSwapsToSort {
    public static int numberOfSwapsToSort(List<Integer> nums) {
        // WRITE YOUR BRILLIANT CODE HERE
        Integer count = 0;
        Integer[] integerArray = (Integer[])nums.toArray();
        for(Integer i = 0; i < integerArray.length; i++){
            Integer current = 0; 
            for(Integer j=0; j<integerArray.length; j++ ){
                current++;
            }
            count++;
        }
        return 0;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>(); //splitWords(scanner.nextLine()).stream().map(Integer::parseInt).collect(Collectors.toList());
        //scanner.close();
        nums.add(5);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(1);
        int res = numberOfSwapsToSort(nums);
        System.out.println(res);
    }
}