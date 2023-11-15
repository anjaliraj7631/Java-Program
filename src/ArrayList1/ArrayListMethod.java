package ArrayList1;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();

//        add methods----------
        l.add(10);
        l.add("java");
        l.add(1,40.25);
        l.add('C');
        ArrayList l1=new ArrayList();
        l1.add("Dsa");
        l1.add(25);
        l.addAll(l1);
        l.addAll(2,l1);
        System.out.println(l);

//check persence
        System.out.println(l.contains("java"));
        System.out.println(l.containsAll(l1));
        System.out.println(l.indexOf(25));
        System.out.println(l.lastIndexOf(25));

//        update method
        l.set(5,"HTML");
        System.out.println(l);

//        Miscellenous
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.get(4));
        Object o=l.toArray();
        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i));
        }
//Remove
        System.out.println(l.remove("java"));
        System.out.println(l);
        System.out.println(l.remove(Integer.valueOf(25)));
        System.out.println(l);
        System.out.println(l.remove(3));
        System.out.println(l);
        l.removeAll(l1);
        System.out.println(l);
        l.clear();
        System.out.println(l);
        System.out.println(l.isEmpty());
    }
}
