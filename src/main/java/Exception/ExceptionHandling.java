package Exception;

public class ExceptionHandling {
    public static void main(String[] args){

        int arr[] = new int[5];

        System.out.println("hello ");


        try {
            System.out.println(arr[9]);
            int a = 10/0;
            System.out.println(a);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("hi ");

    }


}
