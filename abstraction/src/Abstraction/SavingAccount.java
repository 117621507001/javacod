package Abstraction;

public class SavingAccount extends Bankaccount {
    public SavingAccount(String accountnumber,String accountname, double balance) {
        super(accountnumber,accountname, balance);
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposits of $"+amount+" to "+accountname+" account is successful");
    }
    public void withdraw(double amount){
         if(amount<=checkBalance()){
             balance-=amount;
             System.out.println("Withdrawal of $"+amount+" from "+accountname+" account is successful");
         }
         else{
             System.out.println("Insufficient funds");

         }
}
}

