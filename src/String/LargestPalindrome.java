package String;

public class LargestPalindrome {
    public static void main(String[] args) {
        String s="wow tha madam knows malayalam";
        String largestPalindrome=LargestPalindrome(s);
        System.out.println("Largest palindrome : "+largestPalindrome);
    }

    private static String LargestPalindrome(String s) {
        String largestPalindrome=" ";
        String[] words=s.split(" ");
        for (String word:words) {
            String rev=reverseWord(word);
            if(word.equals(rev) && word.length()>largestPalindrome.length() ){
                largestPalindrome=word;
            }
        }
        return largestPalindrome;
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
