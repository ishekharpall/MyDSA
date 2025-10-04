package String;

import java.util.Arrays;

public class checkAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1,str2));
        System.out.println(isAnagramByCount(str1,str2));

    }

    static boolean isAnagram(String str1,String str2){
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()) {
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
    public static boolean isAnagramByCount(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        // normalize: remove non-letters and lowercase (customize as needed)
        s1 = s1.replaceAll("[^A-Za-z]", "").toLowerCase();
        s2 = s2.replaceAll("[^A-Za-z]", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        int[] counts = new int[26]; // only for English letters
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i) - 'a']++;  // l-a=
            counts[s2.charAt(i) - 'a']--;
        }
        for (int c : counts) {
            if (c != 0) return false;
        }
        return true;
    }
}
