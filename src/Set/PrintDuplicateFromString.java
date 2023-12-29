package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class PrintDuplicateFromString {
    public static void main(String[] args) {
        String s="hello world hello is java java null null";
        HashSet<String> hs=new HashSet<>();
        String[] words=s.split(" ");
        String res=new String();
        for (String x:words) {
            if (!(hs.add(x))){
                res+=x+" ";
            }
        }
        System.out.println(res);
        System.out.println(hs);
        LinkedList<String> li=new LinkedList<>(hs);
        for (int i = 0; i < li.size() ; i++) {
            for (int j = i+1; j < li.size(); j++) {
                if(li.get(i).compareToIgnoreCase(li.get(j))>0){
                    String temp=li.get(i);
                    li.set(i, li.get(j));
                    li.set(j,temp);
                }
            }
        }
        System.out.println(li);
    }
}
