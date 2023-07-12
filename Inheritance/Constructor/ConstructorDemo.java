class Person {
    String name;
    Person()
    {
        System.out.println("Superclass Constructor");
    }
    Person(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}

class Student extends Person {
    Student()
    {
        System.out.println("Subclass Constructor");

    }

    String getName()
    {
        return name;
    }
}

public class ConstructorDemo {
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setName("Abhishek");
        System.out.println(student.getName());

        Person person = new Student();  // object of type Superclass and instance of subclass
        person.setName("Tejas");

        // person.getName(); // error:The method getName() is undefined for the type Person

        // Student obj = new Person(); //error

    }
}
