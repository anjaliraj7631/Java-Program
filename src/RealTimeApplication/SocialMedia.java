package RealTimeApplication;

import java.util.Scanner;

public interface SocialMedia {
    void chat();
    void call();
    void login();
    void logout();

}
class Whatsapp implements SocialMedia {
    @Override
    public void chat(){
        System.out.println("Chat in whatsapp");
    }
    @Override
    public void call(){
        System.out.println("Calling from whatsapp");
    }
    @Override
    public void login(){
        System.out.println("Login in Whatsapp");
    }
    @Override
    public void logout(){
        System.out.println("Logout from Whatsapp");
    }
}
class Instagram implements SocialMedia {
    @Override
    public void chat(){
        System.out.println("Chat in instagram");
    }
    @Override
    public void call(){
        System.out.println("Calling from instagram");
    }
    @Override
    public void login(){
        System.out.println("Login in Instagram");
    }
    @Override
    public void logout(){
        System.out.println("Logout from instagram");
    }

}
class Facebook implements SocialMedia {
    @Override
    public void chat(){
        System.out.println("Chat in facebook");
    }
    @Override
    public void call(){
        System.out.println("Calling from facebook");
    }
    @Override
    public void login(){
        System.out.println("Login in Facebook");
    }
    @Override
    public void logout(){
        System.out.println("Logout from facebook");
    }

}
class SocialMediaMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        while (!exit){
            System.out.println("1.Whatsapp \n2.Instagram \n3.Facebook \n4.Exit");
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    SocialMedia whatsapp=new Whatsapp();
                    System.out.println("Enter number");
                    long num=sc.nextLong();
                    int generatedOtp= (int) (Math.random()*9999)+1000;
                    System.out.println("generatedOtp: "+generatedOtp);
                    System.out.println("Enter otp:");
                    int otp=sc.nextInt();
                    if (otp==generatedOtp){
                        whatsapp.login();
                        boolean exit1=false;
                        while (!exit1){
                            System.out.println("1.Chat \n2.Call \n3.logout \n4.Exit");
                            System.out.println("Enter options");
                            int ch=sc.nextInt();
                            switch (ch){
                                case 1:whatsapp.chat();
                                    break;
                                case 2:whatsapp.call();
                                    break;
                                case 3:whatsapp.logout();
                                    break;
                                case 4:exit1 = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        }
                    }
                    else {
                        System.out.println("wrong otp");
                    }
                    break;
                case 2:
                    SocialMedia insta=new Instagram();
                    System.out.println("Enter number");
                    long num1=sc.nextLong();
                    int generatedOtp1= (int) (Math.random()*9999)+1000;
                    System.out.println("generatedOtp: "+generatedOtp1);
                    System.out.println("Enter otp:");
                    int otp1=sc.nextInt();
                    if (otp1==generatedOtp1){
                        insta.login();
                        boolean exit2=false;
                        while (!exit2){
                            System.out.println("1.Chat \n2.Call \n3.Exit");
                            System.out.println("Enter options");
                            int ch=sc.nextInt();
                            switch (ch){
                                case 1:insta.call();
                                    break;
                                case 2:insta.chat();
                                    break;
                                case 3:insta.logout();
                                    break;
                                case 4:exit2 = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        }
                    }
                    else {
                        System.out.println("wrong otp");
                    }
                    break;
                case 3:
                    SocialMedia fb=new Facebook();
                    System.out.println("Enter number");
                    long num3=sc.nextLong();
                    int generatedOtp3= (int) (Math.random()*9999)+1000;
                    System.out.println("generatedOtp: "+generatedOtp3);
                    System.out.println("Enter otp:");
                    int otp3=sc.nextInt();
                    if (otp3==generatedOtp3){
                        fb.login();
                        boolean exit3=false;
                        while (!exit3){
                            System.out.println("1.Chat \n2.Call \n3.Exit");
                            System.out.println("Enter options");
                            int ch=sc.nextInt();
                            switch (ch){
                                case 1:fb.call();
                                    break;
                                case 2:fb.chat();
                                    break;
                                case 3:fb.logout();
                                    break;
                                case 4:exit3 = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        }
                    }
                    else {
                        System.out.println("wrong otp");
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid chice");
            }
        }
    }

}