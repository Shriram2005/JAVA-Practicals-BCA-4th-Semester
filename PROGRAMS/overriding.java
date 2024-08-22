// Program to implement method overriding and method overloading in java
// method overriding


class Animal {
    public void show() {
        System.out.println("These are animals");
    }
}

class Dog extends Animal {
    public void show() {
        System.out.println("This is Dog");
    }
}

public class overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.show();
        b.show();
    }
}


