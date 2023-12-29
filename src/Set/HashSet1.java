package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet hs1=new HashSet<>();
        hs1.add("orange");
        hs1.add(20);
        hs1.add("orange");
        System.out.println(hs1);
        HashSet hs2=new HashSet<>();
        hs2.add(52);
        hs2.add(20);
        hs2.add('c');
        hs1.addAll(hs2);
        System.out.println(hs1);

        System.out.println(hs1.contains(52));
        System.out.println(hs1.contains("Orange"));
        System.out.println(hs1.containsAll(hs2));

        hs1.remove(20);
        System.out.println(hs1);
        hs1.removeAll(hs2);
        System.out.println(hs1);
        hs1.clear();
        System.out.println(hs1);

        hs1.addAll(hs2);
        System.out.println(hs2.size());

        Iterator it=hs1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Object[] o=hs1.toArray();
        System.out.println(Arrays.toString(o));

        System.out.println(hs1.isEmpty());
        hs1.clear();
        System.out.println(hs1.isEmpty());

        //taking value from user
        HashSet h2=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("No of elements want to add:");
        int n=sc.nextInt();
        System.out.println("Enter value");
        for (int i = 0; i < n; i++) {
            h2.add(sc.nextInt());
        }
        System.out.println(h2);
    }
}
