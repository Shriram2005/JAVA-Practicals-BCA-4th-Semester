// Program to perform interfaces in java


// Define the interface
interface Animal {
    void eat();
    void move();
}

// Implement the interface in the Dog class
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void move() {
        System.out.println("Dog is running");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.move();

    }
}
