package Arrays_and_Strings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned){
        //String word;
        //Integer occurences = 0;
        
        // 1. Remove punctuation characters and lower all upercase characters
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();

        // 2). split the string into words
        String[] words = normalizedStr.split("\\s+");
        Set<String> bannedWords = new HashSet<>();
        for(String word: banned)
            bannedWords.add(word);

        Map<String,Integer> map = new HashMap<>();

        /*3.) Count the apareances of each word */
        for(String word: words){
                if( !bannedWords.contains(word)  ){
                    map.put(word, map.getOrDefault(word, 0)+1);
                }
        }

        // 4.) Return the word with the higesth frequency
        return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
        
    }

    public static void main(String args[]){
        String parragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(parragraph,banned));
    }
    
}
