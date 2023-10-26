package String;

public class Occurance {
    public static void main(String[] args) {
        String s="catdogcatdogcat";
        System.out.println(occurance(s));
    }

    private static boolean occurance(String s) {
        int cd = 0;
        int cc = 0;
        while (s.contains("cat")){
            cc++;
            int index=s.indexOf("cat");
            StringBuffer sb=new StringBuffer(s);
            sb.delete(index,index+3);
            s= sb.toString();
        }
        while (s.contains("dog")){
            cd++;
            int index=s.indexOf("dog");
            StringBuffer sb1=new StringBuffer(s);
            sb1.delete(index,index+3);
            s= sb1.toString();
        }
        return cc==cd;
    }
}
