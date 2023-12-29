package ArrayList1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList<>();
        l.add(10);
        l.add("String");
        l.add('d');
        l.add("String");
        l.add(52.2145f);
        l.addFirst(20);
        l.addLast("Orange");
        System.out.println(l);
        l.remove();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.removeFirstOccurrence("String");
        Iterator i=l.descendingIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("-------------");
        i=l.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

}
