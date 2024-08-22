// Program to implement Single and Multilevel inheritance in java
// Single inheritance

class Animal {

    public void show() {
        System.out.println("These are animals");
    }
}

class Dog extends Animal {

    public void type() {
        System.out.println("This is dog");
    }
}

public class singleInheritance {
        public static void main(String args[]) {
            Dog a = new Dog();
            a.show();
            a.type();
        }
    }
