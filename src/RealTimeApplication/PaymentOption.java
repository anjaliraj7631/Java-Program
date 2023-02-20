package RealTimeApplication;


import java.util.Scanner;

class PaymentOption {
    double amount;
    PaymentOption(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void payWithCreditDebitCard(String cardNumber) {
        System.out.println("Paid $" + amount + " with Credit/Debit Card: " + cardNumber);
    }
    public void payWithCashOnDelivery() {
        System.out.println("Paid $" + amount + " with Cash on Delivery.");
    }
    public void payWithEMI(int numberOfInstallments) {
        System.out.println("Paid $" + amount + " in " + numberOfInstallments + " EMI(s)");
    }
    public void payWithUPI(String upiId) {
        System.out.println("Paid $" + amount + " with UPI: " + upiId);
    }
    public void payWithPaytm() {
        System.out.println("Paid $" + amount + " with Paytm");
    }
    public void payWithPhonePe() {
        System.out.println("Paid $" + amount + " with Paytm");
    }
    public void payWithGooglePay() {
        System.out.println("Paid $" + amount + " with Paytm");
    }

}
class Amazon extends PaymentOption {
    public Amazon(double amount) {
        super(amount);
    }
    public void addGiftCard(String couponCode) {
        System.out.println(" after adding amazon pay gift card: " + couponCode+ " we get " + getAmount() +"amount");
    }
    public void useAmazonPayBalance() {
        System.out.println("Paid $" + getAmount() + " using Amazon Pay Balance.");
    }
}
class Flipkart extends PaymentOption {
    public Flipkart(double amount) {
        super(amount);
    }
    public void addGiftCard(String couponCode) {
        System.out.println(" after adding amazon pay gift card: " + couponCode+ " we get " + getAmount() +"amount");
    }
}
class Myntra extends PaymentOption {
    public Myntra(double amount) {
        super(amount);
    }
    public void applyMyntraCoupon(String couponCode) {
        System.out.println(" after applying Myntra coupon: " + couponCode+" we get discount of " + getAmount());
    }
}

class MainPayment{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1.Amazon Payment \n2.Flipkart Payment \n3.Myntra Payment \n4.Exit");
            System.out.println("Enter Choice");
            int ch= sc.nextInt();
            switch (ch){
                case 1:System.out.print("Enter the payment amount: $");
                    double amazonAmount = sc.nextDouble();
                    Amazon amazonPayment =new Amazon(amazonAmount);
                    System.out.println("Choose an Amazon payment method:");
                    System.out.println("1.Credit/Debit Card \n2.Cash on Delivery \n3.EMI Pay \n4.UPI Pay \n5.Amazon Pay/Gpay/Phone Pay/Paytm \n6.Add Amazon Gift Card \n7.Exit");
                    int amazonPaymentChoice = sc.nextInt();
                    switch (amazonPaymentChoice) {
                        case 1:
                            System.out.print("Enter card number: ");
                            String cardNumber = sc.next();
                            amazonPayment.payWithCreditDebitCard(cardNumber);
                            break;
                        case 2:amazonPayment.payWithCashOnDelivery();
                            break;
                        case 3:System.out.print("Enter installation time : ");
                            int install= sc.nextInt();
                            amazonPayment.payWithEMI(install);
                            break;
                        case 4:
                            System.out.println("Enter UPID: ");
                            String upi=sc.next();
                            amazonPayment.payWithUPI(upi);
                            break;
                        case 5: System.out.println("1.Amazon pay \n2.Google Pay \n3.Phone Pay \n4.Paytm ");
                            int c=sc.nextInt();
                            switch (c){
                                case 1:amazonPayment.useAmazonPayBalance();
                                    break;
                                case 2:amazonPayment.payWithGooglePay();
                                    break;
                                case 3:amazonPayment.payWithPhonePe();
                                    break;
                                case 4:amazonPayment.payWithPaytm();
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                            break;
                        case 6:
                            System.out.print("Enter Amazon gift card code: ");
                            String amazonGiftCard = sc.next();
                            amazonPayment.addGiftCard(amazonGiftCard);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 2:System.out.print("Enter the payment amount: $");
                    double flipkarAmount = sc.nextDouble();
                    Flipkart flipkartPayment =new Flipkart(flipkarAmount);
                    System.out.println("Choose an Flipkart payment method:");
                    System.out.println("1.Credit/Debit Card \n2.Cash on Delivery \n3.EMI Pay \n4.UPI Pay \n5.Google Pay \n6.Add Amazon Gift Card \n7.Exit");
                    int flipkartPaymentChoice = sc.nextInt();
                    switch (flipkartPaymentChoice) {
                        case 1:
                            System.out.print("Enter card number: ");
                            String cardNumber = sc.next();
                            flipkartPayment.payWithCreditDebitCard(cardNumber);
                            break;
                        case 2:flipkartPayment.payWithCashOnDelivery();
                            break;
                        case 3:System.out.print("Enter installation time : ");
                            int install= sc.nextInt();
                            flipkartPayment.payWithEMI(install);
                            break;
                        case 4:
                            System.out.println("Enter UPID: ");
                            String upi=sc.next();
                            flipkartPayment.payWithUPI(upi);
                            break;
                        case 5:
                            System.out.println("1.Google Pay \n2.Phone Pay \n3.Paytm ");
                            int c=sc.nextInt();
                            switch (c){
                                case 1:flipkartPayment.payWithGooglePay();
                                    break;
                                case 2:flipkartPayment.payWithPhonePe();
                                    break;
                                case 3:flipkartPayment.payWithPaytm();
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                            break;
                        case 6:
                            System.out.print("Enter Flipkart gift card code: ");
                            String flipkartGiftCard = sc.next();
                            flipkartPayment.addGiftCard(flipkartGiftCard);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 3:System.out.print("Enter the payment amount: $");
                    double myntraAmount = sc.nextDouble();
                    Myntra myntraPayment =new Myntra(myntraAmount);
                    System.out.println("Choose an Myntra payment method:");
                    System.out.println("1.Credit/Debit Card \n2.Cash on Delivery \n3.EMI Pay \n4.UPI Pay \n5.Google Pay \n6.Apply coupon code \n7.Exit");
                    int myntraPaymentChoice = sc.nextInt();
                    switch (myntraPaymentChoice) {
                        case 1:
                            System.out.print("Enter card number: ");
                            String cardNumber = sc.next();
                            myntraPayment.payWithCreditDebitCard(cardNumber);
                            break;
                        case 2:myntraPayment.payWithCashOnDelivery();
                            break;
                        case 3:System.out.print("Enter installation time : ");
                            int install= sc.nextInt();
                            myntraPayment.payWithEMI(install);
                            break;
                        case 4:
                            System.out.println("Enter UPID: ");
                            String upi=sc.next();
                            myntraPayment.payWithUPI(upi);
                            break;
                        case 5:
                            System.out.println("1.Google Pay \n2.Phone Pay \n3.Paytm ");
                            int c=sc.nextInt();
                            switch (c){
                                case 1:myntraPayment.payWithGooglePay();
                                    break;
                                case 2:myntraPayment.payWithPhonePe();
                                    break;
                                case 3:myntraPayment.payWithPaytm();
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                            break;
                        case 6:
                            System.out.print("Enter coupon code: ");
                            String coupon = sc.next();
                            myntraPayment.applyMyntraCoupon(coupon);
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

