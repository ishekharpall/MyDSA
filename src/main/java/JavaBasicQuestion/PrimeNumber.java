package JavaBasicQuestion;

public class PrimeNumber {

    public static void main(String[] args){

        int n =13;
        System.out.println(checkPrime(n));
        System.out.println(checkPrime(15));
    }
    static boolean checkPrime(int n){
        boolean isPrime = false;

        for(int i=2;i*i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
