// Program to perform abstract classes and methods in java


abstract class Animal {
    abstract void show();
}

class Dog extends Animal {
    public void show() {
        System.out.println("This is Dog");
    }
}


public class AbstractExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.show();
    }
}

