package ProgStringArray;

public class ReplaceVowel {
    public static void main(String[] args) {
        String s="hello World";
        replace(s);
    }
    static int countCon(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c!=' '){
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                    count++;
                }
            }
        }
        return count;
    }
    public static char[] toCharArrayMethod(String s){
        char[] c=new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            c[i]=s.charAt(i);
        }
        return c;
    }

    static void replace(String s){
        int count=countCon(s);
        char[] ch=toCharArrayMethod(s);
        if(count>3){
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                if (c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                    ch[i]=' ';
                }
            }
            System.out.println(ch);
        }
        else {
            System.out.println(s);
        }

    }
}
