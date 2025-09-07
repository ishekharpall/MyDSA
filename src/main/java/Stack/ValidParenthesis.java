package Stack;

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {

        String str = "{(){}[]}(({{[[]]}}))";
        System.out.println(validParenthesis(str));
    }
    static boolean validParenthesis(String str){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<str.length();i++){
            char open = str.charAt(i);

            if(open == '(' || open =='{' || open == '[') {
                stack.push(open);
            }else{
                if(stack.isEmpty()) return false;
                char curr = stack.pop();

                if((curr == '(' && open ==')') || (curr == '{' && open =='}' )
                        || (curr == '[' && open == ']')){
                    continue;
                }else return false;
            }
        }

        return stack.isEmpty();
    }
}
