
class Animal {

    public void show() {
        System.out.println("These are animals");
    }

}

class Dog extends Animal {

    public void show() {
        System.out.println("This is dog");
    }

}

class Cat extends Animal {

    public void show() {
        System.out.println("This is Cat");
    }

}


public class HierarchicalInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.show();
        c.show();
    }
}
