import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        //Constructors: ArrayList(), ArrayList(Collection c), ArrayList(int initialCapacity)
        ArrayList<String> AL = new ArrayList<String>();
        AL.add("Abhishek");
        AL.add("Darshan");
        AL.add("Saish");
        AL.add("Sandip");
        System.out.println("List: " + AL);
        AL.set(1, "Disha");
        System.out.println("List: " + AL);
        ArrayList<String> AL2 = new ArrayList<String>();
        AL2.add("Priya");
        AL2.addAll(1,AL);
        System.out.println("List2: " + AL2);
        AL2.remove(2);
        System.out.println("List2: " + AL2);
        System.out.println("List: " + AL);
        AL2.removeAll(AL);
        System.out.println("List2: " + AL2);

        //Using for loop
        for(int i=0; i<AL.size(); i++) {
            System.out.print(AL.get(i) + " ");
        }
        System.out.println();
        //Using forEach
        AL.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        //Using Iterator
        Iterator<String> itr = AL.listIterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
/*
List: [Abhishek, Darshan, Saish, Sandip]
List: [Abhishek, Disha, Saish, Sandip]
List2: [Abhishek, Disha, Saish, Sandip, Priya]
List2: [Abhishek, Disha, Sandip, Priya]
List: [Abhishek, Disha, Saish, Sandip]
List2: [Priya]
Abhishek Disha Saish Sandip
Abhishek Disha Saish Sandip
Abhishek Disha Saish Sandip 
*/