package OOPs;

public class Inheritance {

    public static void main(String[] args){
           Car c= new Car();
           c.noOfTyre();
           c.run();
           c.color = "red";
           c.type="motor";
           System.out.println(c.color);
           System.out.print(c.type);

    }

     static class Vehicle {
        String type;
        String color;
        void run(){
            System.out.println("Vehicle can run");
        }
    }

     static class Car extends Vehicle {
         String type;
         void noOfTyre(){
             System.out.println("Car has 4 tyres");
         }
    }


    
}
