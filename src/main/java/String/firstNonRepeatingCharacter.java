package String;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str ="taaashdghshjvccudvbkoghvbcjsdbc";
        System.out.println(nonRepeating(str));

    }
    static Character nonRepeating(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : str.toCharArray()){
            if(map.get(ch)==1){
                return ch;
            }
        }

    return null;
    }
}
