package StringBuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("Java is programming language");
        String s=sb1.toString();
        System.out.println(sb1.capacity());
        System.out.println(sb1.append("..."));
        System.out.println(sb1.charAt(10));
        System.out.println(s.hashCode());
        System.out.println(sb1.deleteCharAt(30));
        System.out.println(sb1.delete(29,32));
        System.out.println(sb1.indexOf("is"));
        System.out.println(sb1.append(" is"));
        System.out.println(sb1.indexOf("is",15));
        System.out.println(sb1.lastIndexOf("is"));
        System.out.println(sb1.lastIndexOf("is",20));
        System.out.println(sb1.substring(8));
        System.out.println(sb1.substring(13,20));
        sb1.trimToSize();
        System.out.println(sb1.capacity());
        System.out.println(sb1.reverse());

    }
}
