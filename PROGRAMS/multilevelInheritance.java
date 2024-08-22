// Program to implement Single and Multilevel inheritance in java
// Multilevel inheritance

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

class Lab extends Dog {

    public void breed() {
        System.out.println("This breed is labrador");
    }

}


public class multilevelInheritance {
    public static void main(String args[]) {
        Lab a = new Lab();
        a.show();
        a.type();
        a.breed();
    }
}
