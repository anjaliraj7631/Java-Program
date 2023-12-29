package Set;

import java.util.HashSet;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String s="hello world hello";
        HashSet<String> hs=new HashSet<>();
        String res=new String();
        String[] words=s.split(" ");
        for (String x:words) {
            if(hs.add(x)){
                res+=x+" ";
            }
        }
        System.out.println(res);


    }
}
