class Gen<T>
{
    T var;
    T returnVar(T val)
    {
        this.var = val;
        return var;
    }
}

class First
{
    public static void main(String[] args)
    {
        int n = 10;
        // Gen<Integer> object = new Gen<Integer>("67");
        Gen obj = new Gen();
        System.out.println(obj.returnVar("Abhishek"));
        System.out.println(obj.returnVar(3527.6));
    }
}