/*
varargs: Variable-length Arguments
A method with variable-length arguments is called "variable-arity method" or "varargs method" 
*/

public class VarLenArgs {
    public static void main(String[] args) {
        System.out.println("Addition of two numbers: " + sum(10, 20));
        System.out.println("Addition of three numbers: " + sum(10, 20, 30));
        System.out.println("Addition of four numbers: " + sum(10, 20, 30, 40));
        System.out.println("Addition of five numbers: " + sum(10, 20, 30 ,40 ,50));

        System.out.println("Name: " + name('A', 'b', 'h', 'i', 's', 'h', 'e', 'k'));
    }

    public static int sum(int... List){
        int total = 0;

        for(int i=0; i<List.length; i++)
        {
            total += List[i];
        }
        return total;
    }

    public static String name(char ... list){
        // char Name[] = new char[list.length];
        // for(int i=0; i<list.length; i++)
        // {

        // }
        String Name = new String(list);
        return Name;
    }
}
