package String;

public class WordLongestLength {
    public static void main(String[] args) {
        String s="Java is a programming language";
        word(s);
    }
    private static void word(String s) {
        String[] words=s.split(" ");
        int longlen=0;
        String longword=" ";
        for (String word:words) {
            int eachwordlen=word.length();
            if(eachwordlen>longlen){
                longword=word;
                longlen=eachwordlen;
            }
        }
        System.out.println("Lonegest word is: "+longword+"\nand length is: "+longlen);
    }
}
