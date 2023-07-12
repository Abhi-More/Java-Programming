//Multiple catch Blocks

public class Example4 {
    public static void main(String[] args) {
        try {
            int result = 10/args.length;
            System.out.println("Division: " + result);
            args[10] = "Abhi";
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

/*Output 1:
PS C:\AbhishekCode\JavaOracle\ExceptionHandling> javac Example4.java
PS C:\AbhishekCode\JavaOracle\ExceptionHandling> java Example4 I am Abhishek Valu More And I am CS and Engineering Student
Division: 0

Output 2:
PS C:\AbhishekCode\JavaOracle\ExceptionHandling> javac Example4.java
PS C:\AbhishekCode\JavaOracle\ExceptionHandling> java Example4
java.lang.ArithmeticException: / by zero

Output 3:
PS C:\AbhishekCode\JavaOracle\ExceptionHandling> javac Example4.java
PS C:\AbhishekCode\JavaOracle\ExceptionHandling> java Example4 I am Abhishek                                              
Division: 3
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
 */