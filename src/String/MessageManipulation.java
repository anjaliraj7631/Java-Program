package String;

public class MessageManipulation {
    public static void main(String[] args) {
        String s="Hi how are you? I hope you are having a great day!";
        char[] ch=s.toCharArray();
        String s1=" ";
        for (int i = 0; i <=ch.length/2 ; i++) {
            s1=s1+ch[i];
        }
        String s2=" ";
        for (int i = ch.length/2; i < ch.length; i++) {
            s2=s2+ch[i];
        }
//        System.out.println(s1);
        String s3=s2.replace("great","wonderfull");
        System.out.println(s1+" ... "+s3);
    }
}
