// Program to implement types of constructors in java

public class constructors {

    int id;
    String name;

    // default Constructor
    public constructors() {
        this.id = 0;
        this.name = "ABC";
        System.out.println("No-argument constructor called");
    }

    // Parameterized Constructor
    public constructors(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized constructor called");
    }

    // Copy Constructor
    public constructors(constructors obj) {
        this.id = obj.id;
        this.name = obj.name;
        System.out.println("Copy constructor called");
    }

    // display values
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {

        constructors obj1 = new constructors();
        obj1.display();
        constructors obj2 = new constructors(101, "John Doe");
        obj2.display();
        constructors obj3 = new constructors(obj2);
        obj3.display();
    }
}
