// package Inheritance;

/*
 Inheritance in java
 4-Types
    1. Single Inheritance
    2. Multilevel Inheritance
    3. Hierarchical Inheritance
    4. Hybrid Inheritance
 */


 //Example of single inheritance
class Abhishek{
    String name;
    int age;
}

class Darshan extends Abhishek{
    public void printDetail()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Iniheritancer in java...!");
        Darshan obj1 = new Darshan();
        obj1.name = "ABHISHEK";
        obj1.age = 20;
        obj1.printDetail();
    }
}
