package String;
import java.util.*;

public class ReverseOfString {

    public static void main(String[] args){
        String str="Shekhar";
        String str1="ababa";
        System.out.println(reverseOfString(str));
        System.out.println(isPalindrome(str1));
    }

    static String reverseOfString(String str){
        int n= str.length();
        StringBuilder rev = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

    static Boolean
    isPalindrome(String str){
      return str.equals(reverseOfString(str));
    }

}
