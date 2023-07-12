/*
 methods to iterate collection
    1- Enhanced for loop or Foreach loop and Lambda expression
    2- Using iterator() 
 */

import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) 
    {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.print(list);

        // Using for loop using index
        System.out.println("\nPrint list using For loop: ");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        // Using Enhanced for loop
        System.out.println("\nPrint list using Enhanced For loop: ");
        for(Integer l: list)
        {
            System.out.print(l + " ");
        }

        //Using for loop and lambda exression
        System.out.println("\nPrint list using forEach loop: ");
        list.forEach(l -> System.out.print(l + " "));
        // list.forEach(System.out::println);

        // Using Iterator
        System.out.println("\nPrint list using Iterator: ");
        var itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }

        //Map iteration is different than collections

        Map<String, Integer> map = new HashMap<>();
        map.put("Abhishek", 190);
        map.put("Sandip", 100);
        map.put("Ashutosh", 45);
        map.put("Saish", 50);
        map.put("Sahil", 590);

        // using forEach loop
        System.out.println("\nUsing for loop");
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            System.out.println(entry);
        }

        // using key set
        System.out.println("\nUsing key set");
        Set<String> keySet = map.keySet();
        for(String k: keySet)
        {
            System.out.println(k + " : " + map.get(k));
        }
        
        System.out.println("\nUsing values()");
        for(int i : map.values())
        {
            System.out.println(i);
        }

    }
}
