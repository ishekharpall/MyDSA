package JavaBasicQuestion;

import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args){
        int n=9474;
        armstrongNumber(n);

    }
    static void armstrongNumber(int n){
        int a=noOfDigit(n);
        int temp = n;
        int res=0;
        while(n>0){
            int rem=n%10;
            res= (int) (res+Math.pow(rem,a));
        n/=10;
        }
        if(temp==res){
            System.out.print(temp+" is armstrong number");
        }else{
            System.out.print(temp+" is not armstrong number");
        }
    }


    static int noOfDigit(int n){
        int count =0;
        while(n>0) {
            n/=10;
            count++;
        }
       return count;
    }
}
