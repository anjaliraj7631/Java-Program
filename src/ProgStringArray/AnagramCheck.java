package ProgStringArray;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        if (anagram(s1, s2)) {
            System.out.println("The strings are anagram");
        } else {
            System.out.println("The strings are not anagram");
        }
    }

    private static boolean anagram(String s1, String s2) {
        String sort1=sort(s1);
        String sort2=sort(s2);
        if (sort1.length()!=sort2.length()){
            return false;
        }
        for (int i = 0; i < sort1.length(); i++) {
            if (sort1.charAt(i) != sort2.charAt(i)) {
                return false;
            }
        }
        return true;
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
