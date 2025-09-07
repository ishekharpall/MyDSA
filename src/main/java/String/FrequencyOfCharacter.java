package String;

import java.util.HashMap;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str ="Shekhar Pal and Priyanka Do you also want me to show you a one-liner Java 8 Stream solution for this ";
        System.out.println(frequency(str));
        highestFrequency(str);

    }

    static HashMap<Character, Integer> frequency(String str){
        str = str.replaceAll("\\s","").toLowerCase();

        HashMap<Character, Integer> result = new HashMap<>();

        for(char c : str.toCharArray()){
            result.put(c,result.getOrDefault(c,0)+1);
        }

        return result;

    }
    static void highestFrequency(String str){
        HashMap<Character, Integer> map = frequency(str);
        int max = Integer.MIN_VALUE;
        char ans = ' ';

        for(char c : map.keySet()){
            if(map.get(c)>max){
                max = map.get(c);
                ans = c;
            }
        }

        System.out.println(ans+" : "+max);

    }
}
