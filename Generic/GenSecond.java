class Gen<T>
{
    T var;
    // Gen(T val)
    // {
    //     this.var = val;
    // }
    T returnVar(T val)
    {
        this.var = val;
        return var;
    }
}

class Abhishek
{
    int roll;
    String name;
    Abhishek()
    {
        roll = 33;
        name = "Abhishek";
    }
    Abhishek returnObj(int r, String n)
    {
        this.roll = r;
        this.name = n;
        return this;
    }
}

class GenSecond
{
    public static void main(String[] args)
    {
        int n = 10;

        // Gen<Integer> object = new Gen<Integer>("67");
        Abhishek object = new Abhishek();
        Abhishek object2 = new Abhishek();
        Abhishek object3 = new Abhishek();
        object3 = object.returnObj(12, "Tejas");
        // Gen obj2 = new Gen();            //Gives Type erroe
        Gen<Abhishek> obj2 = new Gen<Abhishek>();
        object2 = obj2.returnVar(object3);
        System.out.println(object2.name);
        System.out.println(obj2.getClass().getName());
    }
}