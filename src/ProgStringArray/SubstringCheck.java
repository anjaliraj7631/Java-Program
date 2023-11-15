package ProgStringArray;

public class SubstringCheck {
    public static void main(String[] args) {
        String s1="hello";
        String s2="helloWOrld";
    }
    static String sort(String s){
        char[] ch=s.toCharArray();
        char temp;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(ch[i]>ch[j]){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        return new String(ch);
    }
}
