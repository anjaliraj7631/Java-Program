package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet h=new HashSet<>();
        h.add("java");
        h.add("shreya");
        h.add("suhani");
        h.add(11);
        h.add(18);
        h.add(50);


        for (Object o:h){
            if(o instanceof String){
                if(((String) o).startsWith("s")){
                    System.out.println(o);
                }
            }
        }
        System.out.println("----------------");
//        for (Object o:h){
//            if(o instanceof String){
//                if(!(((String) o).endsWith("a"))){
//                   h.add(o);
//                    System.out.println(o);
//                }
//            }
//        }
        System.out.println(h);
        System.out.println("----------------");
        for (Object o:h) {
            if(o instanceof Integer){
                if((Integer)o>10 && (Integer)o<20){
                    System.out.println(o);
                }
            }
        }

        Iterator it= h.iterator();
        while (it.hasNext()){
            Object o= it.next();
            if(o instanceof String){
                if(((String) o).endsWith("a")){
                    it.remove();
                }
            }
        }
        System.out.println(h);
    }
}
