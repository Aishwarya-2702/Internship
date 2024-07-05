package basics.Assignment3;

import java.util.Scanner;

class BankEntity {
    String accountNumber;
    double accountBalance;
    String accountHolder;

    public void GetBankEntity(String accountNumber, double accountBalance, String accountHolder)
    {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
    }
    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class Account extends BankEntity {
    String cardNumber;
    String cardPin;
    public void GetAccount(String cardNumber, String cardPin)
    {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }
    public boolean validatePin(String enteredPin) {
        return cardPin.equals(enteredPin);
    }

    public void withdraw(double amount, String enteredPin){
        if (validatePin(enteredPin)) {
            if (amount <= getAccountBalance()){
                setAccountBalance(getAccountBalance()-amount);
                System.out.println("Withdrawal Completed Successfully!! Your New Balance: "+getAccountBalance());
            }
            else{
                System.out.println("Insufficient balance in withdrawal");
            }
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
}

class Gpay {
     String upiPin;
     String username;

     public void StartGpay(String upiPin, String username){
         this.upiPin = upiPin;
         this.username = username;
     }
     public boolean validateUpiPin(String enteredUpiPin){
         return upiPin.equals(enteredUpiPin);
     }
    public void payBills(String billerName, double billedAmount, String billerType, String enteredUpiPin, Account account) {
        if (validateUpiPin(enteredUpiPin)) {
            if (billedAmount <= account.getAccountBalance()) {
                account.setAccountBalance(account.getAccountBalance() - billedAmount);
                System.out.println("Bill payment to " + billerName + " (" + billerType + ") successful! Your New balance is: " + account.getAccountBalance());
            }
            else {
                System.out.println("Insufficient balance in billpayment");
            }
        }
        else {
            System.out.println("Invalid upi pin");
        }
    }
}
public class MobileBanking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account acc = new Account();
        acc.GetBankEntity("1234567890", 10000.0, "Aishwarya");
        acc.GetAccount("11112222333344445","1234");

        Gpay pay = new Gpay();
        pay.StartGpay("1234","Aishwarya");
        System.out.println("Enter 1 for Withdrawal or 2 for Bill Payment");
        int menu = scan.nextInt();
        scan.nextLine();

        if(menu==1){
            System.out.println("Enter amount to Withdraw: ");
            double amt = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter Card Pin: ");
            String pin = scan.nextLine();
            acc.withdraw(amt, pin);
        }
        else if(menu==2){
            System.out.println("Enter Biller Name: ");
            String name = scan.nextLine();
            System.out.println("Enter Biller Amount: ");
            double amount = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter Biller Account Type: ");
            String type = scan.nextLine();
            System.out.println("Enter upi pin: ");
            String upi = scan.nextLine();
            pay.payBills(name, amount, type, upi, acc);
        }
        else{
            System.out.println("Invalid Menu Choice");
        }
        scan.close();
    }
}
