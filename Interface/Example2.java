class ClassD implements InterfaceA{
    public void display(String name)
    {
        System.out.println("Name: "+name);
    }
}

public class Example2 {
    public static void main(String[] args) {
        ClassD  obj1 = new ClassD();
        obj1.display("Sandy.."); 
    }
}
