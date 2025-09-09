package OOPs;

public class Polymorphism {
    public static void main(String[] args) {

        add(5, 10);
        add(2,3,4);

        System.out.println();
    }


    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
