package RealTimeApplication;


import java.util.Scanner;
//interface example
public class WithdrawMoney {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int otpGen= generateOtp();
        System.out.println("Generated Otp:"+otpGen);
        System.out.println("Enter Name:");
        String name=sc.next();
        System.out.println("Enter Otp:");
        int otp=sc.nextInt();
        if(otpGen==otp){
            System.out.println("Your account is verified!");
//            System.out.println("Enter Balance:");
//            int bal=sc.nextInt();
            System.out.println("Enter withdraw amount:");
            int credit=sc.nextInt();
            withdraw(credit,name);
        }
        else {
            System.out.println("Incorrect OTP! Please Enter Correct OTP");
        }
    }

    public static int generateOtp(){
        int num=(int) (Math.random()*9999)+1000;
        return num;
    }

    public static void withdraw(int credit, String name){
//        if(bal>=15000 && debit<=9000)
//            System.out.println("Allowed to witrhdraw");
//        else if (bal>=11000 && debit<=19000) {
//            System.out.println("Not allowed to withdraw");
//        } else if (bal>=22000 && debit<=22000) {
//            System.out.println("Allowed to witrhdraw");
//        } else System.out.println(" Not Allowed to witrhdraw");
        int  bal=50000;
        System.out.println("Your current bal is:"+bal);
        int rem=bal;
        rem=rem-credit;
        if (bal>=credit) {
            System.out.println(name+" You are allowed to withdraw the amount");
            System.out.println("Remaining amount is : "+rem);
        }
        else {
            System.out.println(name+ " Your Balance is not sufficient to withdraw amount");
        }
        if(rem<=0){
            System.out.println("I wanted to bring to your attention that the current balance in your account is quite low..");
        }
    }

}
