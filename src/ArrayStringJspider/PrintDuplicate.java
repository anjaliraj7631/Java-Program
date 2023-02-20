package ArrayStringJspider;

import java.util.Scanner;

public class PrintDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value: ");
        String s=sc.nextLine();
        String res= lower(s);
        printDuplicate(res);
    }
    public static char[] toCharArrayMethod(String s){
        char[] c=new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            c[i]=s.charAt(i);
        }
        return c;
    }
    public static String lower(String s){
        String res="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char)(c+32);
                res=res+c;
            }
            else {
                res=res+c;
            }
        }
        return res;
    }
    private static void printDuplicate(String s) {
        char[] c=toCharArrayMethod(s);
        int[] f= new int[c.length];
        for (int i=0;i<c.length;i++){
            f[i]=1;
            for (int j=i+1;j<c.length;j++){
                if(c[i]!='@' && c[j]!='@' && c[i]==c[j]){
                    f[i]++;
                    c[j]='@';
                }
            }
        }
        for (int i=0;i<c.length;i++){
            if(c[i]!='@' && f[i]>1){
                System.out.println(c[i]+"---"+f[i]);
            }
        }
    }
}
