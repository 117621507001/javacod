package Abstraction;

public abstract class Bankaccount {
    public String accountnumber;
    public String accountname;
    public double balance;
    public String getAccountnumber() {
        return accountnumber;
    }
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
    public String getAccountname() {
        return accountname;
    }
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Bankaccount(String accountnumber,String accountname,double balance){
        this.accountnumber=accountnumber;
        this.accountname=accountname;
        this.balance=balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public double checkBalance(){
        return balance;
    }
}


