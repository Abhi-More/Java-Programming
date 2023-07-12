
interface Callable {
    int age = 20;    // variables in interfaces are by default static and final
    void show(String name);
}

class ImpleClass implements Callable{
    public void show(String name){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
     //System.out.println("Age:"+ ++age);  //Error Variables declared in interface is by default final
    }
}

public class Example{
    public static void main(String[] args) {
        ImpleClass OBJ1 = new ImpleClass();
        OBJ1.show("Abhishek");

        //Callable call = new Callable();   //Error...We can not instantiated object of interface refering to interface
        Callable call = new ImpleClass();
        call.show("Darshan");
    }
}