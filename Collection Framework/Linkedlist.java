import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();  // can be written as Collection<String> list = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();
        list.add("Abhishek");
        list.add("Sandip");
        list.add("Darshan");
        list.add("Saish");                                   //add(index, object), addFist(obj), addLast(obj)
        System.out.println("List: " + list);
        list.add(1, "Ganesh");
        System.out.println("List(Ganesh at idx 1): " + list);
        System.out.println("Abhishek in List: "+ list.contains("Abhishek"));
        System.out.println("Size of list: " + list.size());
        list.remove("Darshan");            // remove(), remove(index), removeFirst(), removeLast(), removeFirstOccurrence(obj), removeLastOccurrence(obj)
        System.out.println("List: " + list);
        list.addLast("Darshan");
        System.out.println("List: " + list);
        list.set(0, "Darshan");
        System.out.println("List: " + list);
        System.out.println("Index of Saish: " + list.indexOf("Saish"));  //lastIndexOf(obj)
        System.out.println("get at idx 3: "+ list.get(3));           //getFirst() , getLast()
        list.offer("Piyush");                                      //offerFirst(obj)
        System.out.println("List: " + list);
        System.out.println("First: " + list.peek());      //peekFirst(), peekLast()
        System.out.println("List: " + list);
        System.out.println("Retrive and Remove: "+ list.poll());    //pollFirst(), pollLast()
        System.out.println("List: " + list);
        list2.addAll(list);
        System.out.println("List2: " + list2);
        list2.remove("Abhishek");
        System.out.println("Contains All: "+ list2.containsAll(list));
        list2.clear();
        System.out.println("List2: " + list2);
        System.out.println("IsEmpty list2: " + list2.isEmpty());
        //pop(), push(obj)
    }
}
/*Output:
List: [Abhishek, Sandip, Darshan, Saish]
List(Ganesh at idx 1): [Abhishek, Ganesh, Sandip, Darshan, Saish]
Abhishek in List: true
Size of list: 5
List: [Abhishek, Ganesh, Sandip, Saish]
List: [Abhishek, Ganesh, Sandip, Saish, Darshan]
List: [Darshan, Ganesh, Sandip, Saish, Darshan]
Index of Saish: 3
get at idx 3: Saish
List: [Darshan, Ganesh, Sandip, Saish, Darshan, Piyush]
First: Darshan
List: [Darshan, Ganesh, Sandip, Saish, Darshan, Piyush]
Retrive and Remove: Darshan
List: [Ganesh, Sandip, Saish, Darshan, Piyush]
List2: [Ganesh, Sandip, Saish, Darshan, Piyush]
Contains All: true
List2: []
IsEmpty list2: true
*/
