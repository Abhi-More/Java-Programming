// package Java.Interface;
/*
    Java does not support multiple inheritance because of ambiguity
    But with the help of interface we can create multiple inheritance and there is no ambiguity
 */
interface InterfaceA{
    public void display(String name);
}
interface InterfaceB{
    public void display(String name);
}

class ClassC implements InterfaceA, InterfaceB{
    public void display(String name)
    {
        System.out.println("Name is: " + name);
    }
}

public class MultipleInheritace {
    public static void main(String[] args)
    {
        InterfaceA obj1 = new ClassC();
        obj1.display("Shubham");

        ClassC obj2 = new ClassC();
        obj2.display("Chaitali");
    }   
}
