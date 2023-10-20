package String;

public class StringMethod {
    public static void main(String[] args) {
        String s="Hello world Hello";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.concat(" I am anjali"));
        System.out.println(s.contains("llo"));
        System.out.println(s.startsWith("He"));
        System.out.println(s.endsWith("ld"));
        System.out.println(s.equalsIgnoreCase("hello World"));
        System.out.println(s.indexOf('l'));
        System.out.println(s.indexOf('l',5));
        System.out.println(s.indexOf("o w"));
        System.out.println(s.indexOf("ll",10));
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.lastIndexOf('l',13));
        System.out.println(s.lastIndexOf("ll"));
        System.out.println(s.lastIndexOf("ll",15));
        System.out.println(s.replace('o','u'));
        System.out.println(s.substring(3));
        System.out.println(s.substring(5,10));
        char[] ch=s.toCharArray();
        for (char s1:ch) {
            System.out.println(s1);
        }
        String[] words=s.split(" ");
        for (String word:words) {
            System.out.println(word);
        }

    }
}
