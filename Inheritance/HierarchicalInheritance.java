// package Inheritance;

//Hierarchical Inheritance
class Institute{
    String name = " MET IOE";
    String location = " ADGAON";
}

class Computer extends Institute{
    String dept = " Computer";
    public void show(){
        System.out.println("Department: " + dept + name + location);
    }
}

class IT extends Institute{
    String dept = " Information Technology";
    public void show(){
        System.out.println("Department: " + dept + name + location);
    }
    
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        IT it = new IT();
        it.show();
        Computer comp = new Computer();
        comp.show();
    }
    
}
