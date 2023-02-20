package ArrayStringJspider;

import java.util.Scanner;

public class CountVowelCons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:");
        String s=sc.nextLine();
        count(s);
    }
    public static void count(String s){
        int vowelCount=0;
        int consCount=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                if (c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                    vowelCount++;
                }
                else {
                    consCount++;
                }
            }
        }
        System.out.println("VOWELS: "+vowelCount);
        System.out.println("CONSONANTS: "+consCount);
    }
}
