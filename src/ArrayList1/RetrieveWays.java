package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class RetrieveWays {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        l1.add("hello");
        l1.add(10);
        l1.add(50.25f);
        l1.add('C');
        l1.add("hsjd");
//        using get() and size()
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        System.out.println("----------------------");

//        using for each
        for (Object o:l1) {
            System.out.println(o);
        }

        System.out.println("----------------------");

//    using Iterator
        Iterator i= l1.iterator();
        while (i.hasNext())   {
            System.out.println(i.next());
        }

        System.out.println("----------------------");
//        using ListIterator
        ListIterator li= l1.listIterator();
        while (li.hasNext()){
            li.next();
        }
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
