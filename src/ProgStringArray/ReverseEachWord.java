package ProgStringArray;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s="Java is a programming language";
        reverse(s);
    }

    private static void reverse(String s) {
        String[] words=s.split(" ");
        for (String word:words) {
            String rev=reverseWord(word);
            System.out.print(rev+ " ");
        }
    }
    public static String reverseWord(String word){
        char[] ch=word.toCharArray();
        char[] reverseWord = new char[ch.length];
        for (int i = ch.length-1; i >=0 ; i--) {
            reverseWord[ch.length - 1 - i] = ch[i];
        }
        return  new String(reverseWord);
    }
}
