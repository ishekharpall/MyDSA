package JavaBasicQuestion;

public class PalindromeNumber {
    public static void main(String[] args) {

        int n = 1214121;
        int temp=n;
        int rev = 0;

        while (n != 0) {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(temp==rev){
            System.out.print(temp+" is palindrome number");
        }else{
            System.out.print(temp+" is not palindrome number");
        }
    }
}
