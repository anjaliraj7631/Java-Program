package ProgStringArray;

public class ReplaceFirstWithLastChar {
    public static void main(String[] args) {
        String s="hello world";
        replaceString(s);
    }

    private static void replaceString(String s) {
        String[] words=s.split(" ");
        for (String word:words) {
            String rev=replaceCharWord(word);
            System.out.print(rev+ " ");
        }
    }
    static String replaceCharWord(String word){
        char[] ch=word.toCharArray();
       if(ch.length>1){
               char start=ch[0];
               char end=ch[ch.length-1];
               ch[0]=end;
               ch[ch.length-1]=start;
       }
       return new String(ch);
    }
}
