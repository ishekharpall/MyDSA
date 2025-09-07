package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateFromString {
    public static void main(String[] args) {
        String str = "Shekhar";
        System.out.println(removeDuplicate(str));
    }

    static String removeDuplicate(String str){
        Set<Character> setA = new LinkedHashSet<>();

        for(char ch:str.toCharArray()){
            setA.add(ch);
        }
        StringBuilder result = new StringBuilder();

        for(Object ch :setA.toArray()){
            result.append(ch);
        }

        return result.toString();

    }
}
