package ArrayList1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(10);
        l.add(52);
        l.add(35);
        l.add(25);
        l.add(84);
        l.add(8);
        LinkedList l1=new LinkedList(l);
        for (int i = 0; i < l1.size(); i++) {
            for (int j = i+1; j < l1.size(); j++) {
                if((Integer)l1.get(i)>(Integer) l1.get(j)){
                    int temp=(Integer)l1.get(i);
                    l1.set(i,l1.get(j));
                    l1.set(j,temp);
                }
            }
        }
        for (Object l2:l1) {
            System.out.println(l2);
        }
        System.out.println("------------");

        Iterator it=l1.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
