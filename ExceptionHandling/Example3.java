
import java.util.Random;

public class Example3{
    public static void main(String[] args) {

        System.out.println("Consider Another example using Random()");
        Random r = new Random();
        
        for(int i=0; i<10; i++) {
            int num = r.nextInt(0, 5);
            try {
                int result =  123 / num;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occure: " + e);
            }
        }
    }
}
/*
Sample Output:
Arithmetic exception occure: java.lang.ArithmeticException: / by zero
Result: 30
Result: 41
Result: 30
Arithmetic exception occure: java.lang.ArithmeticException: / by zero
Result: 30
Result: 30
Result: 61
Result: 41
Arithmetic exception occure: java.lang.ArithmeticException: / by zero
*/ 