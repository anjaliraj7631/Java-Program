package RealTimeApplication;


import java.util.Scanner;

public class Wallet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int otpGen= generateOtp();
        System.out.println("Generated Otp:"+otpGen);
        System.out.println("Enter User Id:");
        String name=sc.next();
        System.out.println("Enter phone number:");
        int ph=sc.nextInt();
        System.out.println("Enter Otp:");
        int otp=sc.nextInt();
        if(otpGen==otp){
            System.out.println("Your account is verified!");
            display();
        }
        else {
            System.out.println("Incorrect OTP! Please Enter Correct OTP");
        }
    }

    public static int generateOtp(){
        int num=(int) (Math.random()*9999)+1000;
        return num;
    }
    public static void display(){
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter money persent in wallet");
//        int emoney=sc.nextInt();
        int emoney=5000;
        System.out.println("Current Money in wallet:"+current(emoney));
        System.out.println("Enter money want to add in wallet:");
        int addMoney=sc.nextInt();
        int updateValue=add(emoney,addMoney);
        System.out.println("After adding money:" + add(emoney,addMoney));
        System.out.println("Enter price of item: ");
        int spent=sc.nextInt();
        if(updateValue<spent){
            System.out.println("You have insufficient balance to purchase this item!");
        }
        else {
            System.out.println("After Purchasing item remaining money in wallet: "+sub(updateValue,spent));
        }
    }

    static int current(int emoney){
        return emoney;
    }

    static int add(int emoney,int add){
        int sum=add+emoney;
        return sum;
    }

    static int sub(int updateMoney,int spent){
        int rem=updateMoney-spent;
        return rem;
    }

}
