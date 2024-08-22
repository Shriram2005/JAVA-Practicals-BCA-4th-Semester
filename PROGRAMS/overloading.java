// Program to implement method overriding and method overloading in java
// method overloading


public class overloading {


    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        overloading obj = new overloading();
        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));
        System.out.println("Sum of 10, 20, and 30: " + obj.add(10, 20, 30));
    }
}
