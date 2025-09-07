package String;



public class countVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Shekhar is coding";
        count(str);

    }

    static void count(String str){
       str = str.toLowerCase();
      int countVowels =0;
      int countConsonants =0;
        for(int j=0;j<str.length();j++) {
            char ch = str.charAt(j);
            if(ch == 'a'|| ch=='e' || ch == 'i' || ch== 'o' || ch == 'u'){
                countVowels++;
            }else {
                countConsonants++;
            }
        }
        System.out.println("No. of vowels in "+str+" is "+countVowels);
        System.out.println("No. of consonants in "+str+" is "+countConsonants);

    }
}
