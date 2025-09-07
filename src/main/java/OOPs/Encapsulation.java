package OOPs;

import java.util.Date;

public class Encapsulation {
    public static void main(String[] args){

    }

    class Person{
        private String name ;
        private int age;
        private Date dob;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Date getDob() {
            return dob;
        }

        public void setDob(Date dob) {
            this.dob = dob;
        }
    }
}
