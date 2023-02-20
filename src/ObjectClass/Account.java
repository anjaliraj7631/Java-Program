package ObjectClass;

public class Account {
    private int acc_no;
    private String ifsc;

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }
    Account(){

    }
    public Account(int acc_no,String ifsc) {
        super();
        this.acc_no = acc_no;
        this.ifsc=ifsc;
    }
}
class SavingAccount extends Account{
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    SavingAccount(double balance,String ifsc,int acc_no){
        super(acc_no,ifsc);
        this.balance=balance;
    }
    public void displayAttribute(){
        System.out.println("Account Number: "+getAcc_no());
        System.out.println("IFSC Code: "+getIfsc());
        System.out.println("Balance: "+balance);
    }
    @Override
    public String toString(){
        String s="Account No: "+ super.getAcc_no()+ "IFSC Code: "+super.getIfsc()+ "Balance: "+balance ;
        return s;
    }
    @Override
    public boolean equals(Object o){
        SavingAccount s=(SavingAccount) o;
        return this.balance==s.balance && this.getAcc_no()==getAcc_no() && this.getIfsc().equals(getIfsc());
    }
    @Override
    public int hashCode(){
        int res= (int)balance+(int)getAcc_no()+getIfsc().hashCode();
        return res;
    }
}
class LoanAccount extends Account{
    private double loanAmount;
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    LoanAccount(double loanAmount,String ifsc,int acc_no){
        super(acc_no,ifsc);
        this.loanAmount=loanAmount;
    }
    public void displayAttribute(){
        System.out.println("Account Number: "+getAcc_no());
        System.out.println("IFSC Code: "+getIfsc());
        System.out.println("Loan Amount: "+loanAmount);
    }
@Override
public String toString(){
    String s="Account No: "+ super.getAcc_no()+ "IFSC Code: "+super.getIfsc()+ "Balance: "+loanAmount;
    return s;
}
    @Override
    public boolean equals(Object o){
        LoanAccount l=(LoanAccount) o;
        return this.loanAmount==l.loanAmount && this.getAcc_no()==getAcc_no() && this.getIfsc().equals(getIfsc());
    }
    @Override
    public int hashCode(){
        int res= (int)loanAmount+(int)getAcc_no()+getIfsc().hashCode();
        return res;
    }
}

class MainAccount{
    public static void main(String[] args) {
        LoanAccount lo=new LoanAccount(52085.0,"IDBI50",521452245);
        SavingAccount sa=new SavingAccount(52085.0,"IDBI50",521452245);
        lo.displayAttribute();
        sa.displayAttribute();
        int h1=lo.hashCode();
        int h2=sa.hashCode();
        System.out.println(h1==h2);
    }
}
