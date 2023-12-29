package ProgStringArray;

public class DecimalToBinary {
    public static void decimalToBinary(int num){
        String s="";
        while (num>0){
            int rem=num%2;
            s=rem+s;
            num/=2;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        decimalToBinary(10);
    }
}
