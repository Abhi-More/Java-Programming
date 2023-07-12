//Uncaught exception

public class Example1 {
    public static void main(String[] srgs) {
        int a = 35; 
        int b = 0; 
        int result = a/b;
        System.out.println(result);
    }
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example1.main(Example1.java:5)
*/