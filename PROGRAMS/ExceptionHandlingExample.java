// Program to implement exception handling in java

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try {
            int a = 100 / 0;
            System.out.println(a);
        } catch (ArithmeticException err) {
            System.out.println(err);
        } finally {
            System.out.println("Division attempt complete.");
        }
        
    }
}



