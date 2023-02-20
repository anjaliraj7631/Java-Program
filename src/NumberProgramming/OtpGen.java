package NumberProgramming;

import java.util.Scanner;

public class OtpGen {
    public static void main(String[] args) {
        String otp= otpGen();
        System.out.println("Generated Otp:"+otp);
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(otp.equals(s)){
            System.out.println("vLAKDS");
        }
    }

   static String otpGen(){
        // Math method: will return value in double
       // Random: return random number and here we give range
       // String.valueOf: will convert given value into string
        int num=(int) (Math.random()*99999)+10000;
        String otp=String.valueOf(num);
        return otp;
   }
}
