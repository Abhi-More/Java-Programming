
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {

        System.out.println("Consider Another example using Random()");
        Random r = new Random();
        
        try {
            for(int i=0; i<=100; i++) {
                int num = r.nextInt(0, 5);
                int result =  123 / num;
                System.out.println("Result: " + result);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occure: " + e);
        }
    }
}
/*
Sample Output:
Consider Another example using Random()
Result: 41
Result: 61
Result: 30
Result: 61
Result: 30
Arithmetic exception occure: java.lang.ArithmeticException: / by zero
*/ 