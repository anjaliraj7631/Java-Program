package ProgStringArray;

public class ReverseStringOvercomeImmutability {
    public static void main(String[] args) {
        String s="java";
        System.out.println(reverses(s));
        rev(s);
    }
    static void rev(String s){
        StringBuffer sb=new StringBuffer(s);
        StringBuffer sb1=new StringBuffer();
        for (int i = sb.length()-1; i >=0; i--) {
            sb1=sb1.append(sb.charAt(i));
        }
        System.out.println(sb1);
    }
    private static String reverses(String s) {
        char[] ch=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}
