package RealTimeApplication;


import java.util.Scanner;

public interface Gpay {
    void balance();
    void transfer();
}
class SBI implements Gpay {
    private double accountBalance=50000;

    SBI (double accountBalance) {
        this.accountBalance = accountBalance;
    }
    SBI() {
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    @Override
    public void balance() {
        System.out.println("Balance in SBI: "+getAccountBalance());
    }
    @Override
    public void transfer() {
        Scanner sc=new Scanner(System.in);
        double transfer_money=sc.nextDouble();
        if(accountBalance>=transfer_money){
            accountBalance=accountBalance-transfer_money;
            System.out.println("Transfer successful from SBI  and Remaining Balance in SBI: "+accountBalance);
        }
        else {
            System.out.println("Insufficient balance to transfer");
        }
    }
}
class HDFC implements Gpay {
    private double accountBalance=50000;

    HDFC(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public HDFC() {

    }
    public double getAccountBalance(){
        return accountBalance;
    }
    @Override
    public void balance() {
        System.out.println("Balance in SBI: "+getAccountBalance());
    }
    @Override
    public void transfer() {
        Scanner sc=new Scanner(System.in);
        double transfer_money=sc.nextDouble();
        if(accountBalance>=transfer_money){
            accountBalance=accountBalance-transfer_money;
            System.out.println("Transfer successful from HDFC  and Remaining Balance in HDFC: "+accountBalance);
        }
        else {
            System.out.println("Insufficient balance to transfer");
        }
    }
}
class ICICI implements Gpay {
    private double accountBalance=50000;

    ICICI() {
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    @Override
    public void balance() {
        System.out.println("Balance in SBI: "+getAccountBalance());
    }
    @Override
    public void transfer() {
        Scanner sc=new Scanner(System.in);
        double transfer_money=sc.nextDouble();
        if(accountBalance>=transfer_money){
            accountBalance=accountBalance-transfer_money;
            System.out.println("Transfer successful from ICICI and Remaining Balance in ICICI: "+accountBalance);
        }
        else {
            System.out.println("Insufficient balance to transfer");
        }
    }
}
class User_Info{
    protected boolean ge;
    private String name;
    private long phoneNum;
    private int otp;
    public User_Info(String name,long phoneNum){
        this.name=name;
        this.phoneNum=phoneNum;
        this.otp=generatedOtp();
    }
    public static int generatedOtp(){
        int generated_otp=(int) (Math.random()*9999)+1000;
        return generated_otp;
    }
}
class User_Info_Valid{
    public static boolean validateOtp(int eneteredOtp){
        return User_Info.generatedOtp()==eneteredOtp;
    }
}
class GpayFactory{
    public static Gpay getBank(){
        Gpay g;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name: ");
        String name = sc.next();
        if (name.equalsIgnoreCase("SBI")) {
            g= new SBI();
            boolean exit=false;
            while (!exit) {
                System.out.println("1.Balance \n2.Transfer \n3.Exit");
                System.out.println("Enter Choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        g.balance();
                        break;
                    case 2:
                        System.out.println("Enter amount want to transfer: ");
                        g.transfer();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        } else if (name.equalsIgnoreCase("ICICI")) {
            g=new ICICI();
            boolean exit=false;
            while (!exit) {
                System.out.println("1.Balance \n2.Transfer \n3.Exit");
                System.out.println("Enter Choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        g.balance();
                        break;
                    case 2:
                        System.out.println("Enter amount want to transfer: ");
                        g.transfer();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        } else if (name.equalsIgnoreCase("HDFC")) {
            g= new HDFC();
            boolean exit=false;
            while (!exit) {
                System.out.println("1.Balance \n2.Transfer \n3.Exit");
                System.out.println("Enter Choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        g.balance();
                        break;
                    case 2:
                        System.out.println("Enter amount want to transfer: ");
                        g.transfer();
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        } else
            g=null;
        return g;
    }
}

class GpayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter name: ");
        String name = sc.next();
//        System.out.println("Enter phone number:");
//        long number = sc.nextLong();
        boolean phone = false;
        while (!phone) {
            System.out.println("Enter 10 Digit Phone Number: ");
            long phoneNumber = sc.nextLong();
            long c = 0;
            while (phoneNumber > 0) {
                c++;
                phoneNumber = phoneNumber / 10;
            }
            if (c == 10) {
                phone=true;
                System.out.println("Valid phone number");
                User_Info user_details = new User_Info(name, phoneNumber);

                int generateOtp = user_details.generatedOtp();
                System.out.println("Generated otp: " + generateOtp);
                System.out.println("Enetr otp:");
                int otp = sc.nextInt();
                if (otp == generateOtp) {
                    System.out.println("otp valid");
                    while (count < 4) {
                        System.out.println("1.SBI \n2.ICICI \n3.HDFC \n4.Exit");
                        System.out.println("Enter Choice:");
                        int choice = sc.nextInt();
                        if (choice == 4) {
                            System.out.println("Exiting from Gpay! Visit Again... ");
                            break;
                        }
                        Gpay g = GpayFactory.getBank();
                        if (g == null) {
                            System.out.println("Invalid bank name! Please re-enter.");
                        }
                        count++;
                    }
                } else System.out.println("not valid");
            } else {
                phone=false;
                System.out.println("Invalid phone number! please re-enter");
            }
        }
    }
}
