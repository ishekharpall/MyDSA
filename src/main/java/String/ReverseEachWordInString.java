package String;

public class ReverseEachWordInString {
    public static void main(String[] args){
        String str="Shekhar is learning java";
        System.out.print(reverseEachWordInString(str));
    }
    static String reverseEachWordInString(String str){
         String[] words = str.split(" ");
         String rev= "";
         for(int i=0;i<words.length;i++){
             String word = words[i];

             StringBuilder revWord = new StringBuilder(word);
             revWord.reverse();
            rev =rev + revWord.toString()+" ";
         }
       return rev;

    }
}
