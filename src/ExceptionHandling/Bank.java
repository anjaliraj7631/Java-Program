package ExceptionHandling;

import java.util.Scanner;

abstract class Bank {
    private double balance=20000;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    abstract void deposit(double amount) ;
    abstract void withdraw(double amount);
}
class DepositICICI extends RuntimeException{
    DepositICICI(String s){
        super(s);
    }
}

class WithdrawICICI extends RuntimeException{
    WithdrawICICI(String s){
        super(s);
    }
}
class DepositHDFC extends RuntimeException{
    DepositHDFC(String s){
        super(s);
    }
}
class WithdrawHDFC extends RuntimeException{
    WithdrawHDFC(String s){
        super(s);
    }
}
class Insufficient extends RuntimeException{
    Insufficient(String s){
        super(s);
    }
}

class ICICI extends Bank{
    @Override
    void deposit(double amount) throws DepositICICI{
        if(amount%2000==0){
            System.out.println("Previous Balance: "+getBalance());
            double updatedBalance=getBalance()+amount;
            System.out.println("Updated Balance in ICICI: "+updatedBalance);
        }
        else {
            throw new DepositICICI("Invalid amount, not multiple of 2000");
        }
    }
    @Override
    void withdraw(double amount) throws WithdrawICICI,Insufficient{
        if(amount%500==0 && getBalance()>500){
            System.out.println("Previous Balance: "+getBalance());
            double updatedBalance=getBalance()-amount;
            System.out.println("Remaining balance in ICICI: "+updatedBalance);
        } else if (getBalance()<500) {
            throw new Insufficient("Insufficient amount");
        } else {
            throw new WithdrawICICI("Invalid amount, not multiple of 500");
        }

    }
}
class HDFC extends Bank{
    @Override
    void deposit(double amount) throws DepositHDFC{
        if(amount%1000==0){
            System.out.println("Previous Balance: "+getBalance());
            double updatedBalance=getBalance()+amount;
            System.out.println("Updated Balance in HDFC: "+updatedBalance);
        }
        else {
            throw new DepositHDFC("Invalid amount, not multiple of 1000");
        }
    }

    @Override
    void withdraw(double amount) throws WithdrawHDFC,Insufficient{
        if(amount%2000==0 && getBalance()>2000){
            System.out.println("Previous Balance: "+getBalance());
            double updatedBalance=getBalance()-amount;
            System.out.println("Remaining balance in HDFC: "+updatedBalance);
        } else if (getBalance()<2000) {
            throw new Insufficient("Insufficient balance ro withdraw");
        } else {
            throw new WithdrawHDFC("Invalid amount, not multiple of 2000");
        }
    }
}
class BankMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ICICI i = new ICICI();
        HDFC h = new HDFC();
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter amount:");
            double amount = sc.nextDouble();
            System.out.println("1.Deposit ICICI \n2.Withdraw ICICI \n3.Deposit HDFC \n4.Withdraw HDFC \n5.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        i.deposit(amount);
                    } catch (DepositICICI d) {
                        System.out.println(d.getMessage());
                    }
                    break;
                case 2:
                    try {
                        i.withdraw(amount);
                    } catch (WithdrawICICI w) {
                        System.out.println(w.getMessage());
                    }catch (Insufficient in){
                        System.out.println(in.getMessage());
                    }
                    break;
                case 3:
                    try {
                        h.deposit(amount);
                    } catch (DepositHDFC d) {
                        System.out.println(d.getMessage());
                    }
                    break;
                case 4:
                    try {
                        h.withdraw(amount);
                    } catch (WithdrawHDFC w) {
                        System.out.println(w.getMessage());
                    }catch (Insufficient ine){
                        System.out.println(ine.getMessage());
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
